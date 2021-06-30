package com.adetayoolaitan.data.repository

import com.adetayoolaitan.data.datasource.LocalDataSource
import com.adetayoolaitan.data.mapper.EventMapper
import com.adetayoolaitan.domain.model.Event
import com.adetayoolaitan.domain.repository.EventRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class EventRepositoryImpl(
    private val localDataSource: LocalDataSource,
    private val eventMapper: EventMapper,
): EventRepository {
    override suspend fun getEvents(): Flow<List<Event>> {
        return localDataSource.getEvents().map { eventMapper.mapToEventList(it) }
    }

    override suspend fun insertEvent(event: Event) {
        val event = eventMapper.mapToEventEntity(event)
        localDataSource.insertEvent(event)
    }

    override suspend fun deleteEventByEventId(eventId: Int) {
        localDataSource.deleteEventByEventId(eventId)
    }

    override suspend fun deleteAllEvents() {
        localDataSource.deleteAllEvents()
    }
}