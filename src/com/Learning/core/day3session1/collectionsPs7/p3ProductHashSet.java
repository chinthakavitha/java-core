package com.Learning.core.day3session1.collectionsPs7;

import java.util.HashSet;

public class p3ProductHashSet {
	    public static void main(String[] args) {
	        HashSet<D03P07p3> products = new HashSet<>();

	        // Predefined information of 4 products
	        products.add(new D03P07p3("P001", "Apple iPhone"));
	        products.add(new D03P07p3("P002", "Samsung Galaxy"));
	        products.add(new D03P07p3("P003", "Maruti Dezire"));
	        products.add(new D03P07p3("P004", "HP Laptop"));

	        String searchProductId = "P003";
	        D03P07p3 foundProduct = searchProduct(products, searchProductId);

	        if (foundProduct != null) {
	            System.out.println("Product Found ");
	        } else {
	            System.out.println("Product Not Found");
	        }
	    }

	    public static D03P07p3 searchProduct(HashSet<D03P07p3> products, String productId) {
	        for (D03P07p3 product : products) {
	            if (product.getProductId().equals(productId)) {
	                return product;
	            }
	        }
	        return null;
	    }
	}



