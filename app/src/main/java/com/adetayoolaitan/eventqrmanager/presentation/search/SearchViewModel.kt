package com.adetayoolaitan.eventqrmanager.presentation.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.adetayoolaitan.domain.model.Event
import com.adetayoolaitan.domain.usecase.event.GetEventsUseCase
import com.adetayoolaitan.domain.usecase.event.InsertEventUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val getEventsUseCase: GetEventsUseCase,
): ViewModel() {

    private val _events = MutableLiveData<List<Event>>()
    val events:LiveData<List<Event>> get() = _events

    fun getEvents() = viewModelScope.launch {
        getEventsUseCase.execute()
            .onEach {
                _events.value = it
            }
            .launchIn(viewModelScope)
    }

    private val _text = MutableLiveData<String>().apply {
        value = "Events"
    }
    val text: LiveData<String> = _text
}