package com.Learning.core.day3session1.collectionsPs7;

import java.util.TreeSet;

public class Mainps8 {
    public static void main(String[] args) {
        TreeSet<Personps8> personSet = new TreeSet<>();
        personSet.add(new Personps8(1, "Jerry", 25, 999.0));
        personSet.add(new Personps8(2, "Smith", 30, 2999.0));
        personSet.add(new Personps8(3, "Popeye", 35, 5999.0));
        personSet.add(new Personps8(4, "Jones", 40, 6999.0));
        personSet.add(new Personps8(5, "John", 45, 1999.0));
        personSet.add(new Personps8(6, "Tom", 50, 3999.0));

        double sum = 0;
        for (Personps8 person : personSet) {
            sum += person.getSalary();
        }
        System.out.println(sum);
    }
}
