package com.Learning.core.day3session1.collectionsPs7;
import java.util.HashSet;

	public class D03P07mainp2 {
	    public static void main(String[] args) {
	        HashSet<Productp2> products = new HashSet<>();

	        //  predefined product information
	        products.add(new Productp2("P001", "Maruti 800"));
	        products.add(new Productp2("P002", "Maruti Zen"));
	        products.add(new Productp2("P003", "Maruti Dezire"));
	        products.add(new Productp2("P004", "Maruti Alto"));

	        // all product details
	        System.out.println("Product details:");
	        for (Productp2 product : products) {
	            System.out.println(product);
	        }
	    }
	}

