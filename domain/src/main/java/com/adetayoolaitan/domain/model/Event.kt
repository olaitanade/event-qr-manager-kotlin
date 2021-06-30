package com.adetayoolaitan.domain.model

data class Event(
    val eventId:Int,
    val title:String,
    val description:String?=null,
    val ticketsNo:Int,
    val deleted:Boolean?=null,
    val datetimeAdded:String?=null,
    val eventDate:String?=null,
)