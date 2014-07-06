package com.dio.hw.lesson06.calendar;

/**
 * Created by Андрей on 05.07.2014.
 */
public class Person
{
    private final String firstName;
    private final String secondName;
    private final String email;
    private final String phone;

    private Person(Builder builder){
        this.firstName=builder.firstName;
        this.secondName=builder.secondName;
        this.email=builder.email;
        this.phone=builder.phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (email != null ? !email.equals(person.email) : person.email != null) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (phone != null ? !phone.equals(person.phone) : person.phone != null) return false;
        if (secondName != null ? !secondName.equals(person.secondName) : person.secondName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "[ "+this.firstName+"; "+this.secondName+"; "+this.email+"; "+this.phone+" ]";
    }

    public static class Builder
    {
        private String firstName;
        private String secondName;
        private String email;
        private String phone;

        public Builder()
        {
        }

        public Builder(Person original)
        {
            this.firstName=original.firstName;
            this.secondName=original.secondName;
            this.email=original.email;
            this.phone=original.phone;
        }

        public Builder firstName(String firstName)
        {
            this.firstName=firstName;
            return this;
        }

        public Builder secondName(String secondName)
        {
            this.secondName=secondName;
            return this;
        }

        public Builder email(String email)
        {
            this.email=email;
            return this;
        }

        public Builder phone(String phone)
        {
            this.phone=phone;
            return this;
        }

        public Person build()
        {
            return new Person(this);
        }

    }
}
