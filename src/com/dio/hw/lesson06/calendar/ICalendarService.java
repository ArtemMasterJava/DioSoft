package com.dio.hw.lesson06.calendar;

import java.util.Date;
import java.util.List;

/**
 * Created by Андрей on 06.07.2014.
 */
public interface ICalendarService
{
    void addEvent(Event newEvent);

    Event createEvent(
            String title,
            String description,
            List<String> attenders,
            Date startDate,
            Date endDate);

    Event createEvent(String description, List<String> attenders);

}
