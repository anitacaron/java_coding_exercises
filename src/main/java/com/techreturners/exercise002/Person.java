package com.techreturners.exercise002;

public class Person {
    private String firstname;
    private String lastname;
    private String city;
    private int age;

    public Person(String firstname, String lastname, String city, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.age = age;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}