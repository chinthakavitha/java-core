package com.Learning.core.day3session1.collectionsPs7;
import java.util.HashSet;

	class D03P07p3 {
	    private String productId;
	    private String productName;

	    public D03P07p3(String productId, String productName) {
	        this.productId = productId;
	        this.productName = productName;
	    }

	    public String getProductId() {
	        return productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    @Override
	    public String toString() {
	        return "Product ID: " + productId + ", Product Name: " + productName;
	    }

	    @Override
	    public int hashCode() {
	        return productId.hashCode();
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        D03P07p3 product = (D03P07p3) obj;
	        return productId.equals(product.productId);
	    }
	}

	