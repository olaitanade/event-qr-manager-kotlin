package com.adetayoolaitan.eventqrmanager

import android.app.Application
import timber.log.Timber

class EventQRManager: Application(){
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}