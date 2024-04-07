package com.Learning.core.day3session2.hashmap.ps8;

import java.util.TreeMap;

public class Mainp5 {
    public static void main(String[] args) {
        TreeMap<Carp5, Double> carMap = new TreeMap<>();
        // Predefined car details
        carMap.put(new Carp5("Bugatti", 80050.0), 80050.0);
        carMap.put(new Carp5("Swift", 305000.0), 305000.0);
        carMap.put(new Carp5("Audi", 600100.0), 600100.0);
        carMap.put(new Carp5("Benz", 900000.0), 900000.0);

        // Retrieve all car details
        for (Carp5 car : carMap.keySet()) {
            System.out.println(car);
        }
    }
}
