package com.adetayoolaitan.data.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "events")
data class Event(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "event_id") val eventId:Int,

    @ColumnInfo(name = "title") val title:String,
    @ColumnInfo(name = "description") val description:String?=null,

    @ColumnInfo(name = "tickets_no") val ticketsNo:Int,
    @ColumnInfo(name = "deleted") val deleted:Boolean?=null,
    @ColumnInfo(name = "datetime_added") val datetimeAdded:String?=null,
    @ColumnInfo(name = "event_date") val eventDate:String?=null,
)