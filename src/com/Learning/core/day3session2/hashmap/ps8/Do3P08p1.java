package com.Learning.core.day3session2.hashmap.ps8;
import java.util.HashMap;
import java.util.Map;

	public class Do3P08p1 {

	  public static void main(String[] args) {
	    // HashMap to store phone book entries
	    HashMap<String, Long> phoneBook = new HashMap<String, Long>();

	    // Adding predefined phone book entries
	    phoneBook.put("Amal", 998787823L);
	    phoneBook.put("Manvitha", 937843978L);
	    phoneBook.put("Joseph", 7882221113L);
	    phoneBook.put("Smith", 8293893311L);
	    phoneBook.put("Kathe", 7234560011L);

	    //  all phone book entries
	    for (Map.Entry<String, Long> entry : phoneBook.entrySet()) {
	      System.out.println(entry.getKey() + " " + entry.getValue());
	    }
	  }
	}
