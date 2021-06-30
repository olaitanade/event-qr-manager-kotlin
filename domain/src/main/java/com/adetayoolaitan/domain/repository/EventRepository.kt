package com.adetayoolaitan.domain.repository

import com.adetayoolaitan.domain.model.Event
import kotlinx.coroutines.flow.Flow

interface EventRepository {
    suspend fun getEvents(): Flow<List<Event>>

    suspend fun insertEvent(event: Event)

    suspend fun deleteEventByEventId(eventId:Int)

    suspend fun deleteAllEvents()
}