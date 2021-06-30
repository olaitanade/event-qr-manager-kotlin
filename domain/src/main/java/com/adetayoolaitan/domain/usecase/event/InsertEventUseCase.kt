package com.adetayoolaitan.domain.usecase.event

import com.adetayoolaitan.domain.model.Event
import com.adetayoolaitan.domain.repository.EventRepository
import javax.inject.Inject

class InsertEventUseCase @Inject constructor(
    private val repository: EventRepository
) {

    suspend fun execute(event: Event){
        repository.insertEvent(event)
    }

}