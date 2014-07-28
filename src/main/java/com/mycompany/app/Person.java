package com.mycompany.app;

/**
 * Created by grzegorzaperlinski on 28.07.2014.
 */
public class Person {
    private String name;
    private int age;
    public Person (String initialName, int initialAge) {
        this.name = initialName;
        this.age = initialAge;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void growOld() {
        age = age+1;
    }
}