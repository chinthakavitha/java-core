package com.Learning.core.day3session1.collectionsPs7;

import java.util.TreeSet;

public class Mainps9 {
    public static void main(String[] args) {
        TreeSet<Personps9> personSet = new TreeSet<>();
        personSet.add(new Personps9(1, "Jerry", 25, 999.0));
        personSet.add(new Personps9(2, "Smith", 30, 2999.0));
        personSet.add(new Personps9(3, "Popeye", 35, 5999.0));
        personSet.add(new Personps9(4, "Jones", 22, 6999.0));
        personSet.add(new Personps9(5, "John", 45, 1999.0));
        personSet.add(new Personps9(6, "Tom", 50, 3999.0));

        for (Personps9 person : personSet) {
            if (person.getName().startsWith("J")) {
                System.out.println(person);
                break;
            }
        }
    }
}
