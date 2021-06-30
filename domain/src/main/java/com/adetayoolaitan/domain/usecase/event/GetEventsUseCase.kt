package com.adetayoolaitan.domain.usecase.event

import com.adetayoolaitan.domain.model.Event
import com.adetayoolaitan.domain.repository.EventRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetEventsUseCase @Inject constructor(
    private val repository: EventRepository
) {
    suspend fun execute(): Flow<List<Event>> = repository.getEvents()
}