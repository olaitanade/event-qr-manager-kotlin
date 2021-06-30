package com.adetayoolaitan.domain.repository

import com.adetayoolaitan.domain.model.Event
import kotlinx.coroutines.flow.Flow

interface ValidatorTicketRepository {
    suspend fun getValidatorTickets(): Flow<List<Event>>

    suspend fun insertValidatorTicket(event: Event)

    suspend fun deleteValidatorTicketByEventId(eventId:String)

    suspend fun deleteAllValidatorTickets()
}