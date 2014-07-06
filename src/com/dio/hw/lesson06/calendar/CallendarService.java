package com.dio.hw.lesson06.calendar;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Андрей on 05.07.2014.
 */
public class CallendarService implements ICalendarService
{
    private static Map<Integer,Event> allEvent = new HashMap<Integer, Event>();

    public void addEvent(Event newEvent)
    {
        allEvent.put(allEvent.size(),newEvent);
    }

    public Event createEvent(
           String title,
           String description,
           List<String> attenders,
           Date startDate,
           Date endDate)
    {
        Event newEvent = new Event.Builder()
            .title(title)
            .description(description)
            .attenders(attenders)
            .startDate(startDate)
            .endDate(endDate)
            .build();

        return newEvent;
    }

    public Event createEvent(String description, List<String> attenders)
    {
        Event newEvent = new Event.Builder()
                .title("")
                .description(description)
                .attenders(attenders)
                .startDate(new Date())
                .endDate(new Date())
                .build();

        return newEvent;
    }


}
