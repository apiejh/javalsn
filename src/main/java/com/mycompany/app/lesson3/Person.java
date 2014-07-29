package com.mycompany.app.lesson3;

/**
 * Created by grzegorzaperlinski on 29.07.2014.
 */
public class Person {
    private final String email;
    private int age;

    public Person(String email) {
        this.email = email;
    }

    public Person(String email, int age) {
        this.email = email;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
