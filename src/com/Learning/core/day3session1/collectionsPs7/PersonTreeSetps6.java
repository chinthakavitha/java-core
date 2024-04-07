package com.Learning.core.day3session1.collectionsPs7;

import java.util.TreeSet;

public class PersonTreeSetps6 {
    public static void main(String[] args) {
        TreeSet<Personps6> personSet = new TreeSet<>();
        personSet.add(new Personps6(1, "Jerry", 25, 999.0));
        personSet.add(new Personps6(2, "Smith", 30, 2999.0));
        personSet.add(new Personps6(3, "Popeye", 35, 5999.0));
        personSet.add(new Personps6(4, "Jones", 40, 6999.0));
        personSet.add(new Personps6(5, "John", 45, 1999.0));
        personSet.add(new Personps6(6, "Tom", 50, 3999.0));

        for (Personps6 person : personSet) {
            System.out.println(person);
        }
    }
}