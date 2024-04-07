package com.Learning.core.day3session1.collectionsPs7;
import java.util.HashSet;
import java.util.Iterator;

public class ProductManagementp4 {

	    public static void main(String[] args) {

	        HashSet<D03P07p4> products = new HashSet<D03P07p4>();

	        // predefined products
	        products.add(new D03P07p4("P001", "Maruti 800"));
	        products.add(new D03P07p4("P002", "Maruti Zen"));
	        products.add(new D03P07p4("P003", "Maruti Dezire"));
	        products.add(new D03P07p4("P004", "Maruti Alto"));

	        // Remove product P002
	        String productIDToRemove = "P002";
	        Iterator<D03P07p4> it = products.iterator();

	        while (it.hasNext()) {
	        	D03P07p4 product = it.next();
	            if (product.getProductID().equals(productIDToRemove)) {
	                it.remove();
	                break;
	            }
	        }

	        // Displaying remaining products
	        System.out.println("Products:");
	        for (D03P07p4 product : products) {
	            System.out.println(product);
	        }
	    }
	}


