package com.Learning.core.day3session1.collectionsPs7;
import java.util.HashSet;
import java.util.Iterator;

	public class D03P07p4 {

	    private String productID;
	    private String productName;

	    public D03P07p4(String productID, String productName) {
	        this.productID = productID;
	        this.productName = productName;
	    }

	    public String getProductID() {
	        return productID;
	    }

	    public void setProductID(String productID) {
	        this.productID = productID;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    @Override
	    public String toString() {
	        return productID + productName ;
	    }
	}

	