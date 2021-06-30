package com.adetayoolaitan.domain.model

data class ValidatorTicket(
    val ticketId:String,
    val validatorId:String,
    val eventId:String,
    val description:String?=null,
    val deleted:String?=null,
    val datetimeAdded:String?=null,
    val eventDate:String?=null,
)
