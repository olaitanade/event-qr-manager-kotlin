package com.adetayoolaitan.domain.repository

import com.adetayoolaitan.domain.model.Event
import kotlinx.coroutines.flow.Flow

interface TicketRepository {
    suspend fun getTickets(): Flow<List<Event>>

    suspend fun insertTicket(event: Event)

    suspend fun deleteTicketByEventId(eventId:String)

    suspend fun deleteAllTickets()
}