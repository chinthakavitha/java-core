package com.Learning.core.day3session1.collectionsPs7;

import java.util.TreeSet;

public class PersonTreeSetps7 {
    public static void main(String[] args) {
        TreeSet<Personps7> personSet = new TreeSet<>();
        personSet.add(new Personps7(1, "Jerry", 25, 999.0));
        personSet.add(new Personps7(2, "Smith", 30, 2999.0));
        personSet.add(new Personps7(3, "Popeye", 35, 5999.0));
        personSet.add(new Personps7(4, "Jones", 40, 6999.0));
        personSet.add(new Personps7(5, "John", 45, 1999.0));
        personSet.add(new Personps7(6, "Tom", 50, 3999.0));

        for (Personps7 person : personSet) {
            System.out.println(person.getName().toUpperCase());
        }
    }
}
