package com.adetayoolaitan.data.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tickets")
data class Ticket(
    @PrimaryKey
    @ColumnInfo(name = "ticket_id") val ticketId:String,

    @ColumnInfo(name = "event_id") val eventId:String,
    @ColumnInfo(name = "description") val description:String?=null,
    @ColumnInfo(name = "deleted") val deleted:String?=null,
    @ColumnInfo(name = "datetime_added") val datetimeAdded:String?=null,
    @ColumnInfo(name = "event_date") val eventDate:String?=null,
)
