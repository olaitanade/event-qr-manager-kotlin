package com.adetayoolaitan.domain.usecase.event

import com.adetayoolaitan.domain.repository.EventRepository
import javax.inject.Inject

class GetEventsUseCase @Inject constructor(
    private val repository: EventRepository
) {

    suspend fun execute(){
        repository.getEvents()
    }

}