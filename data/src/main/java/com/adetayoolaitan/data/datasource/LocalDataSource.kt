package com.adetayoolaitan.data.datasource

import com.adetayoolaitan.data.room.dao.EventDao
import com.adetayoolaitan.data.room.dao.TicketDao
import com.adetayoolaitan.data.room.dao.ValidatorDao
import com.adetayoolaitan.data.room.dao.ValidatorTicketDao
import com.adetayoolaitan.data.room.entity.Event
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val dao: EventDao,
    private val ticketDao: TicketDao,
    private val validatorDao: ValidatorDao,
    private val validatorTicketDao: ValidatorTicketDao,
) {
    suspend fun insertEvent(event: Event) = dao.insertEvent(event)

    fun getEvents() = dao.getEvents()

    suspend fun deleteEventByEventId(eventId:Int) = dao.deleteEventByEventId(eventId)

    suspend fun deleteAllEvents() = dao.deleteAllEvents()

}