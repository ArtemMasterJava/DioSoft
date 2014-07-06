package com.dio.hw.lesson02.task01;

/*
Создайте POJO класс, поля которого являются final (Person)
Создайте Enum который характеризует экзмпляр POJO класса (Должность:DIRECTOR, DEVELOPER, QA)
Добавьте Enum как поле в POJO
Cгенерируйте equals/hashcode методы
Создайте Main класс, в main методе которого проведите сравнение экземпляров по ссылке и через метод equals
 */

public class PersonOld
{
    private final String name = "Andrey";
    private final int age = 29;
    private Position position;

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public Position getPosition()
    {
        return this.position;
    }

    public void setPosition(Position position)
    {
        this.position=position;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonOld person = (PersonOld) o;

        if (age != person.age) return false;
        if (!name.equals(person.name)) return false;
        if (position != person.position) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + position.hashCode();
        return result;
    }

    enum Position {DIRECTOR, DEVELOPER, QA};
}
