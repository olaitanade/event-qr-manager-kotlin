package com.adetayoolaitan.domain.model

import java.util.*

data class Event(
    val eventId:String,
    val title:String,
    val description:String?=null,
    val ticketsNo:Int,
    val deleted:Boolean?=false,
    val datetimeAdded:String?= Date().toString(),
    val eventDate:String?=null,
)