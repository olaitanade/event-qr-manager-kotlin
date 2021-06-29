package com.adetayoolaitan.data.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ValidatorTicket {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertValidatorTicket(validatorTicket: ValidatorTicket)

    @Query("SELECT * FROM validator_tickets ORDER BY datetime_added DESC")
    fun getValidatorTickets(): Flow<List<ValidatorTicket>>

    @Query("DELETE FROM validator_tickets WHERE event_id=:eventId")
    suspend fun deleteValidatorTicketByEventId(eventId:Int)

    @Query("DELETE FROM validator_tickets")
    suspend fun deleteAllValidatorTickets()
}