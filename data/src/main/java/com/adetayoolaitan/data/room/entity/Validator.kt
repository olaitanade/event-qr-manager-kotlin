package com.adetayoolaitan.data.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "validators")
data class Validator(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "validator_id") val validatorId:Int,

    @ColumnInfo(name = "name") val name:String,
    @ColumnInfo(name = "event_id") val eventId:Int,
    @ColumnInfo(name = "tickets_validated") val ticketsValidated:Int?=null,
    @ColumnInfo(name = "tickets_no") val ticketsNo:Int?=null,
    @ColumnInfo(name = "deleted") val deleted:Boolean?=null,
    @ColumnInfo(name = "datetime_added") val datetimeAdded:String?=null,
)