package com.adetayoolaitan.eventqrmanager.other

import java.util.*

object IdGenerator {
    fun generateUUID(): String = UUID.randomUUID().toString()
}