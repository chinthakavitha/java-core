package com.Learning.core.day3session1.collectionsPs7;

   class Productp2 {
	    private String productId;
	    private String productName;

	    public Productp2(String productId, String productName) {
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
	        return productId + " " + productName;
	    }
	}


