package com.adetayoolaitan.domain.repository

import com.adetayoolaitan.domain.model.Event
import kotlinx.coroutines.flow.Flow

interface ValidatorRepository {
    suspend fun getValidators(): Flow<List<Event>>

    suspend fun insertValidator(event: Event)

    suspend fun deleteValidatorByEventId(eventId:String)

    suspend fun deleteAllValidators()
}