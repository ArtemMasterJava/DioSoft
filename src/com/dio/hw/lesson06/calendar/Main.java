package com.dio.hw.lesson06.calendar;

import java.util.*;

/**
 * Created by Андрей on 05.07.2014.
 */
public class Main
{
    //local code review (vtegza): add some output @ 21.07.14
    public static void main(String[] args)
    {
        List<String> descriptions = new ArrayList<String>();
        Map<Person,String> attenders = new HashMap<Person, String>();

        Person personAndrey = new Person.Builder()
                .firstName("Andrey")
                .secondName("Korol")
                .email("aking1907@gmail.com")
                .phone("099-999-99-99")
                .build();

        Person personViktor = new Person.Builder()
                .firstName("Viktor")
                .secondName("Donald")
                .email("vikingk@gmail.com")
                .phone("063-999-99-99")
                .build();

        Person personDmitriy = new Person.Builder()
                .firstName("Dmitriy")
                .secondName("Voronin")
                .email("vorona@gmail.com")
                .phone("044-999-99-99")
                .build();

        attenders.put(personAndrey, personAndrey.getEmail());
        attenders.put(personDmitriy,personDmitriy.getEmail());
        attenders.put(personViktor,personViktor.getEmail());

        descriptions.add(0,"Тренинг в DioSoft");
        descriptions.add(1,"Дигустация нового пива");
        descriptions.add(2,"Полет на воздушном шаре");

        List<String> attendFE = new ArrayList<String>();
        attendFE.add(0,personAndrey.getEmail());
        attendFE.add(0,personViktor.getEmail());
        attendFE.add(0,personDmitriy.getEmail());

        Event eventFirst = new Event.Builder()
                .title("Тренинг")
                .description(descriptions.get(0))
                .attenders(attendFE)
                .startDate(new Date())
                .endDate(new Date())
                .build();

        List<String> attendSE = new ArrayList<String>();
        attendSE.add(0,personAndrey.getEmail());
        attendSE.add(0,personDmitriy.getEmail());

        Event eventSecond = new Event.Builder()
                .title("Пивко")
                .description(descriptions.get(1))
                .attenders(attendFE)
                .startDate(new Date())
                .endDate(new Date())
                .build();

        List<String> attendTE = new ArrayList<String>();
        attendTE.add(0,personAndrey.getEmail());

        Event eventThird = new Event.Builder()
                .title("Шар")
                .description(descriptions.get(2))
                .attenders(attendFE)
                .startDate(new Date())
                .endDate(new Date())
                .build();

        CallendarService cs = new CallendarService();
        cs.addEvent(eventFirst);
        cs.addEvent(eventSecond);
        cs.addEvent(eventThird);

    }
}
