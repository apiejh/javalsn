package com.mycompany.app.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by grzegorzaperlinski on 29.07.2014.
 */
public class PersonTest {
    @Test
    public void shouldStoreEmail() {
        Person person = new Person("email@example.com");
        Assert.assertEquals("email@example.com",person.getEmail());
    }
    @Test
    public void shouldStoreAge() {
        Person person = new Person("email@example.com", 22);
        Assert.assertEquals(22,person.getAge());
    }
}
