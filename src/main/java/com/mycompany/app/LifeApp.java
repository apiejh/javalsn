package com.mycompany.app;

/**
 * Created by grzegorzaperlinski on 28.07.2014.
 */
public class LifeApp {
    public static void main( String[] args )
    {
        Person person1 = new Person("John Doe", 22);
        Person person2 = new Person("Tom Jerry", 16);
        Person person3 = new Person("Jack Kowalski", 30);
        Person person4 = new Person("Francis Drake", 50);
        Person person5 = new Person("Hannah Montana", 3);
        Person[] people = new Person[]{person1, person2, person3, person4, person5};
        for (Person p: people) {
            for (int i = 0; i < 50; i++) {
                String firstLetter = String.valueOf(p.getName().charAt(0));
                if ((firstLetter).equals("J")) {
                    p.growOld();
                    p.growOld();
                } else {
                    p.growOld();
                }
            }
            if (p.getAge() > 60) {
                System.out.println(p.getName() + " " + p.getAge() + " stary");
            }
            else {
                System.out.println(p.getName() + " " + p.getAge());
            }
        }
    }
}