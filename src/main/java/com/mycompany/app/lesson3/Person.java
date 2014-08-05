package com.mycompany.app.lesson3;

/**
 * Created by grzegorzaperlinski on 29.07.2014.
 */
public class Person {
    private String email;
    private String name;
    private int age;

    public Person(String email) {
        this.email = email;
    }

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private String getFirstLetter() {
        return String.valueOf(this.getName().charAt(0));
    }

    public int Age(int aging) {
        if (getFirstLetter().equals("J")) {
            return age + aging * 2;
        }
        else {
            return age + aging;
        }
    }

}
