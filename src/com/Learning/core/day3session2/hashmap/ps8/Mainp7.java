package com.Learning.core.day3session2.hashmap.ps8;

import java.util.Map;
import java.util.TreeMap;

public class Mainp7 {
    public static void main(String[] args) {
        TreeMap<Carp7, Double> carMap = new TreeMap<>();
        // Predefined car details
        carMap.put(new Carp7("Benz", 900000.0), 900000.0);
        carMap.put(new Carp7("Bugatti", 80050.0), 80050.0);
        carMap.put(new Carp7("Audi", 600100.0), 600100.0);
        carMap.put(new Carp7("Swift", 305000.0), 305000.0);

        // Retrieve the key-value mapping associated with the greatest price
        Map.Entry<Carp7, Double> greatestEntry = carMap.lastEntry();
        System.out.println(greatestEntry.getKey());

        // Retrieve the key-value mapping associated with the least price
        Map.Entry<Carp7, Double> leastEntry = carMap.firstEntry();
        System.out.println(leastEntry.getKey());
    }
}



