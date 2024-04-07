package com.Learning.core.day3session2.hashmap.ps8;

import java.util.Map;
import java.util.TreeMap;

public class Mainp8 {
	   public static void main(String[] args) {
	        TreeMap<Carp8, Double> carMap = new TreeMap<>();
	        // Predefined car details
	        carMap.put(new Carp8("Benz", 900000.0), 900000.0);
	        carMap.put(new Carp8("Bugatti", 80050.0), 80050.0);
	        carMap.put(new Carp8("Audi", 600100.0), 600100.0);
	        carMap.put(new Carp8("Swift", 305000.0), 305000.0);

	        // Remove and get the key-value mapping associated with the greatest key
	        Map.Entry<Carp8, Double> greatestEntry = carMap.pollLastEntry();
	        System.out.println(greatestEntry.getKey());

	        // Print the remaining key-value mappings
	        for (Map.Entry<Carp8, Double> entry : carMap.entrySet()) {
	            System.out.println(entry.getKey());
	        }
	    }
	}
