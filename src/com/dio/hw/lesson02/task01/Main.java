package com.dio.hw.lesson02.task01;

/**
 Создайте Main класс, в main методе которого проведите сравнение экземпляров по ссылке и через метод equals
 Создайте два массива элементами которых Являются ранее созданные Pojo объекты
 Создайте Main класс, в main методе которого проведите распечатку в консоль и сравнение двух масивов
 */
public class Main
{
    public static void main(String[] args)
    {
        Person firstPerson = new Person();
        Person secondPerson = new Person();

        //firstPerson.setPosition(Person.Position.DEVELOPER);
        //secondPerson.setPosition(Person.Position.QA);

        if(firstPerson.equals(secondPerson))
            System.out.println("Экземпляры равны.");
        else
            System.out.println("Экземпляры не равны.");

        Person[] firstArray = {firstPerson, secondPerson};

        firstPerson.setPosition(Person.Position.DEVELOPER);
        secondPerson.setPosition(Person.Position.QA);

        Person[] secondArray = {firstPerson, secondPerson};

        if(firstArray.equals(secondArray))
            System.out.println("Массивы равны.");
        else
            System.out.println("Массивы не равны.");

        System.out.println(firstArray.toString());
        System.out.println(secondArray.toString());

    }
}
