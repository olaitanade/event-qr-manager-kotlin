package com.adetayoolaitan.data.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "validator_tickets")
data class ValidatorTicket(
    @PrimaryKey
    @ColumnInfo(name = "ticket_id") val ticketId:String,

    @ColumnInfo(name = "validator_id") val validatorId:Int,
    @ColumnInfo(name = "event_id") val eventId:Int,
    @ColumnInfo(name = "description") val description:String?=null,
    @ColumnInfo(name = "deleted") val deleted:String?=null,
    @ColumnInfo(name = "datetime_added") val datetimeAdded:String?=null,
    @ColumnInfo(name = "event_date") val eventDate:String?=null,
)
