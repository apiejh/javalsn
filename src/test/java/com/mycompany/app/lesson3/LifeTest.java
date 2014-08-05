package com.mycompany.app.lesson3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by grzegorzaperlinski on 29.07.2014.
 */
public class LifeTest {
    /*
    metoda age postarza o tyle ile jest lat w parametrze, getter pobierajacy persony, getter pobierajacy sume lat
    */
    @Test
    public void shouldStorePeople() {
        List<Person> people = createPeopleWithOnePerson();

        Life life = new Life(people);

        Assert.assertEquals(people, life.getPeople());
    }

    @Test
    public void shouldAgeStoredPeople() {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Rick", 15));
        people.add(new Person("Mary", 80));
        Life life = new Life(people);

        life.agePeople(10);

        Assert.assertEquals(25, life.getPeople().get(0).getAge());
        Assert.assertEquals(90, life.getPeople().get(1).getAge());

    }

    private List<Person> createPeopleWithOnePerson() {
        List<Person> people = new ArrayList<Person>();
        people.add(Person.createWithName("Tom"));
        return people;
    }
}
