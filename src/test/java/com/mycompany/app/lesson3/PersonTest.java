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
        person1 = new Person("John Rambo", "email@example.com", 22);
        person2 = new Person("Adrianne Rambo", "email@example.com", 22);
    }

    @Test
    public void shouldStoreEmail() {
        Person person = new Person("email@example.com");
        Assert.assertEquals("email@example.com", person.getEmail());
    }

    @Test
    public void shouldStoreAge() {
        Assert.assertEquals(22, person1.getAge());
    }

    @Test
    public void shouldStoreName() {
        Assert.assertEquals("John Rambo", person1.getName());
    }

    @Test
    public void shouldAgeTwiceAsFarWhenNameStartsWithJ() {
        Assert.assertEquals(42, person1.Age(10));
    }

    @Test
    public void shouldAgeNormallyWhenNameDoesNotStartsWithJ() {
        Assert.assertEquals(32, person2.Age(10));
    }

}
