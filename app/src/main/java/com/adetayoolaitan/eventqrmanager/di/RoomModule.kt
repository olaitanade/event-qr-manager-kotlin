package com.adetayoolaitan.eventqrmanager.di

import android.content.Context
import androidx.room.Room
import com.adetayoolaitan.data.room.EventQRManagerDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {
    @Singleton
    @Provides
    fun provideRunningDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        EventQRManagerDB::class.java,
        "EventQRManagerDB.db"
    ).fallbackToDestructiveMigration()
        .build()

    @Singleton
    @Provides
    fun provideEventDao(db: EventQRManagerDB) = db.getEventDao()

    @Singleton
    @Provides
    fun provideTicketDao(db: EventQRManagerDB) = db.getTicketDao()

    @Singleton
    @Provides
    fun provideValidatorDao(db: EventQRManagerDB) = db.getValidatorDao()

    @Singleton
    @Provides
    fun provideValidatorTicketDao(db: EventQRManagerDB) = db.getValidatorTicketDao()
}