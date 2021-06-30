package com.adetayoolaitan.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.adetayoolaitan.data.room.dao.EventDao
import com.adetayoolaitan.data.room.dao.TicketDao
import com.adetayoolaitan.data.room.dao.ValidatorDao
import com.adetayoolaitan.data.room.dao.ValidatorTicketDao
import com.adetayoolaitan.data.room.entity.Event
import com.adetayoolaitan.data.room.entity.Ticket
import com.adetayoolaitan.data.room.entity.Validator
import com.adetayoolaitan.data.room.entity.ValidatorTicket

@Database(
    entities = [Event::class, Ticket::class, Validator::class,ValidatorTicket::class],
    version = 2
)
abstract class EventQRManagerDB: RoomDatabase() {
    abstract fun getEventDao():EventDao
    abstract fun getTicketDao(): TicketDao
    abstract fun getValidatorDao(): ValidatorDao
    abstract fun getValidatorTicketDao(): ValidatorTicketDao
}