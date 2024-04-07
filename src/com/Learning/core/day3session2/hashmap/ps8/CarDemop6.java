package com.Learning.core.day3session2.hashmap.ps8;


import java.util.Set;
import java.util.TreeSet;

public class CarDemop6 {

    public static void main(String[] args) {
        // Creating some car objects
        Carp6 car1 = new Carp6("Bugatti", 80050.0);
        Carp6 car2 = new Carp6("Benz", 900000.0);
        Carp6 car3 = new Carp6("Audi", 600100.0);
        Carp6 car4 = new Carp6("Swift", 305000.0);

        // Creating a TreeSet to store the cars (sorted by price in descending order)
        Set<Carp6> carSet = new TreeSet<>();
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);
        carSet.add(car4);

        // Printing the sorted cars
        for (Carp6 car : carSet) {
            System.out.println(car);
        }
    }
}

