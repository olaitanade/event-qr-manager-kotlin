package com.adetayoolaitan.eventqrmanager.presentation.event.create

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.adetayoolaitan.domain.usecase.event.InsertEventUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.adetayoolaitan.domain.model.Event

@HiltViewModel
class CreateEventViewModel @Inject constructor(
    private val insertEventUseCase: InsertEventUseCase,
): ViewModel() {

    fun addNewEvent(event: Event) = viewModelScope.launch {
        insertEventUseCase.execute(event)
    }

}