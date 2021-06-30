package com.adetayoolaitan.data.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.adetayoolaitan.data.room.entity.Ticket
import kotlinx.coroutines.flow.Flow

@Dao
interface TicketDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTicket(ticket: Ticket)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTickets(tickets: List<Ticket>)

    @Query("SELECT * FROM tickets ORDER BY datetime_added DESC")
    fun getTickets(): Flow<List<Ticket>>

    @Query("DELETE FROM tickets WHERE event_id=:eventId")
    suspend fun deleteTicketByEventId(eventId:Int)

    @Query("DELETE FROM tickets")
    suspend fun deleteAllTickets()
}