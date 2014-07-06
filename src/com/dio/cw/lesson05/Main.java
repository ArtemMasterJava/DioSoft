package com.dio.cw.lesson05;

/**
 * Created by Андрей on 01.07.2014.
 */
public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person.Builder()
            .firstName("Jack")
            .secondName("Donald")
            .email("jack@gmail.com")
            .phone("099-999-99-99")
            .build();

        Person person1 = new Person.Builder(person)
                .phone("095-955-95-95")
                .build();

        Person person2 = new Person.Builder(person)
                .phone("095-955-95-99")
                .build();

        Person[] A = {person,person1};
        Person[] B = {person,person2};


        PersonArrayHelperImp someArray = new PersonArrayHelperImp();
        Person [] result=someArray.merge(A, B);

        for (Person aResult : result) {
            System.out.println(aResult.toString());
        }

        //System.out.println(person.toString());
        //System.out.println(personCopy.toString());

    }
}
