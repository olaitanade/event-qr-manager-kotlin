package com.adetayoolaitan.eventqrmanager.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Be Your Own Event Manager"
    }
    val text: LiveData<String> = _text
}