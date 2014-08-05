package com.mycompany.app.lesson3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by grzegorzaperlinski on 29.07.2014.
 */
public class PersonTest {

    private Person person1;
    private Person person2;

    @Before
    public void setUp() throws Exception {
        person1 = createPersonWithNameAndAge("John Rambo", 22);
        person2 = new Person("Adrianne Rambo", "email@example.com", 22);
    }

    @Test
    public void shouldStoreEmail() {
        Person person = new Person("email@example.com");
        Assert.assertEquals("email@example.com", person.getEmail());
    }

    @Test
    public void AgeShouldReturnCurrentAge() {
        Person person = createPersonWithAge(22);
        Assert.assertEquals(22, person.Age(0));
    }

    @Test
    public void shouldStoreAge() {
        Person person = createPersonWithAge(32);
        Assert.assertEquals(32, person.getAge());
    }

    @Test
    public void shouldCreatePersonWithNameOnly() {
        Person person = Person.createWithName("Gina");
        Assert.assertEquals("Gina", person.getName());
    }

    @Test
    public void shouldCreatePersonWithNameOnlyIsZeroYearsOld() {
        Person person = Person.createWithName("Paul");
        Assert.assertEquals(0, person.getAge());
    }

    @Test
    public void shouldStoreName() {
        Person person = Person.createWithName("Stefan");
        Assert.assertEquals("Stefan", person.getName());
    }

    @Test
    public void shouldAgeTwiceAsFarWhenNameStartsWithJ() {
        person1 = createPersonWithNameAndAge("John", 22);
        Assert.assertEquals(42, person1.Age(10));
    }

    @Test
    public void shouldAgeNormallyWhenNameDoesNotStartsWithJ() {
        Assert.assertEquals(32, person2.Age(10));
    }

    private Person createPersonWithNameAndAge(String name, int age) {
        return new Person(name, "email@example.com", age);
    }

    private Person createPersonWithAge(int age) {
        return createPersonWithNameAndAge("John", age);
    }

}
