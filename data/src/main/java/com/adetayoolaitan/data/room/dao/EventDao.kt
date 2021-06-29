package com.adetayoolaitan.data.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.adetayoolaitan.data.room.entity.Event
import kotlinx.coroutines.flow.Flow

@Dao
interface EventDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEvents(events: Event)

    @Query("SELECT * FROM events ORDER BY datetime_added DESC")
    fun getEvents(): Flow<List<Event>>

    @Query("DELETE FROM events WHERE event_id=:eventId")
    suspend fun deleteEventByEventId(eventId:Int)

    @Query("DELETE FROM events")
    suspend fun deleteAllEvents()
}