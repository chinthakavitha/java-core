package com.Learning.core.day3session2.hashmap.ps8;
import java.util.HashMap;

	public class D03P08p2 {
	    public static void main(String[] args) {
	        HashMap<String, String> phoneBook = new HashMap<>();
	        //  phone book details
	        phoneBook.put("Joseph", "7882221113");
	        phoneBook.put("Mary", "9998887776");
	        phoneBook.put("John", "7776665554");
	        phoneBook.put("Jane", "8887776665");
	        phoneBook.put("Michael", "6665554443");

	        // Searching for the phone number
	        String nameToSearch = "Joseph";
	        String phoneNumber = searchPhoneNumber(phoneBook, nameToSearch);
	        System.out.println(phoneNumber);
	    }

	    public static String searchPhoneNumber(HashMap<String, String> phoneBook, String name) {
	        // Using get() method to retrieve phone number by name
	        return phoneBook.getOrDefault(name, "Name not found");
	    }
	}

