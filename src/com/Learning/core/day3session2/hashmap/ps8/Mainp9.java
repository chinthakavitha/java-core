package com.Learning.core.day3session2.hashmap.ps8;

import java.util.Map;
import java.util.TreeMap;

public class Mainp9 {
    public static void main(String[] args) {
        TreeMap<Carp9, Double> carMap = new TreeMap<>();
        // Predefined car details
        carMap.put(new Carp9("Reva", 80050.0), 80050.0);
        carMap.put(new Carp9("Swift", 305000.0), 305000.0);
        carMap.put(new Carp9("Audi", 600100.0), 600100.0);
        carMap.put(new Carp9("Bugatti", 9999.0), 9999.0);

        // Replace the value mapped by the specified key with the new value
        double newValue = 80050.0;
        for (Map.Entry<Carp9, Double> entry : carMap.entrySet()) {
            if (entry.getValue().equals(newValue)) {
                Carp9 car = entry.getKey();
                carMap.remove(car);
                carMap.put(car, newValue);
                break;
            }
        }

        // Printing the updated mapping
        for (Map.Entry<Carp9, Double> entry : carMap.entrySet()) {
            if (entry.getValue().equals(newValue)) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}