package com.adetayoolaitan.eventqrmanager.di

import com.adetayoolaitan.data.datasource.LocalDataSource
import com.adetayoolaitan.data.mapper.EventMapper
import com.adetayoolaitan.data.repository.EventRepositoryImpl
import com.adetayoolaitan.domain.repository.EventRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideEventRepository(localDataSource: LocalDataSource, eventMapper: EventMapper): EventRepository {
        return EventRepositoryImpl(localDataSource, eventMapper)
    }
}