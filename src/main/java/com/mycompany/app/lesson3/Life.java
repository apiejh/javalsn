package com.mycompany.app.lesson3;

import java.util.List;

/**
 * Created by grzegorzaperlinski on 29.07.2014.
 */
public class Life {
    private List<Person> people;

    public Life(List<Person> people) {
        this.people = people;
    }

    public static void main( String[] args )
    {

    }

    public List<Person> getPeople() {
        return people;
    }

    public void agePeople(int years) {
        for (Person p: people) {
            p.Age(years);
        }
    }
}
