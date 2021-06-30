package com.adetayoolaitan.domain.model

data class Validator(
    val validatorId:Int,
    val name:String,
    val eventId:Int,
    val ticketsValidated:Int?=null,
    val ticketsNo:Int?=null,
    val deleted:Boolean?=null,
    val datetimeAdded:String?=null,
)
