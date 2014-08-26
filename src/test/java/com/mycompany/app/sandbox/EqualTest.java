package com.mycompany.app.sandbox;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

/**
 * Created by grzegorzaperlinski on 26.08.2014.
 */
public class EqualTest {
    @Test
    public void test1 () {
        Cokolwiek c1 = new Cokolwiek(1);
        Cokolwiek c2 = new Cokolwiek(2);
        Cokolwiek c3 = new Cokolwiek(1);
        Object o1 = new Object();

        //Assert.assertEquals(c1, c2);
        //Assert.assertEquals(c1, o1);
        Assert.assertEquals(c1, c2);
    }
    private static class Cokolwiek {
        private int i;
        public Cokolwiek(int i) {
            this.i = i;
        }
        @Override
        public String toString() {
            return String.valueOf(i);
        }
        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Cokolwiek)) {
                return false;
            }
            Cokolwiek c = (Cokolwiek)o;
            return i == c.i;
        }
    }
}
