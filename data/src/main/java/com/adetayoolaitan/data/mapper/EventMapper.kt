package com.adetayoolaitan.data.mapper

import com.adetayoolaitan.domain.model.Event
import javax.inject.Inject

class EventMapper @Inject constructor() {
    fun mapToEventEntity(event: Event):com.adetayoolaitan.data.room.entity.Event{
        return com.adetayoolaitan.data.room.entity.Event(
            eventId = event.eventId,
            title = event.title,
            description = event.description,
            ticketsNo = event.ticketsNo,
            deleted = event.deleted,
            datetimeAdded = event.datetimeAdded,
            eventDate = event.eventDate
        )
    }

    fun mapToEventEntityList(list:List<Event>):List<com.adetayoolaitan.data.room.entity.Event>{
        return list.map { mapToEventEntity(it) }
    }

    fun mapToEvent(event:com.adetayoolaitan.data.room.entity.Event):Event{
        return Event(
            eventId = event.eventId,
            title = event.title,
            description = event.description,
            ticketsNo = event.ticketsNo,
            deleted = event.deleted,
            datetimeAdded = event.datetimeAdded,
            eventDate = event.eventDate
        )
    }

    fun mapToEventList(list:List<com.adetayoolaitan.data.room.entity.Event>):List<Event>{
        return list.map { mapToEvent(it) }
    }
}