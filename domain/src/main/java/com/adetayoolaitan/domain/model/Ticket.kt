package com.adetayoolaitan.domain.model

data class Ticket(
    val ticketId:String,
    val eventId:Int,
    val description:String?=null,
    val deleted:String?=null,
    val datetimeAdded:String?=null,
    val eventDate:String?=null,
)
