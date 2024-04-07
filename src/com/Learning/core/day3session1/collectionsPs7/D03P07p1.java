package com.Learning.core.day3session1.collectionsPs7;
import java.util.ArrayList;
	public class D03P07p1 {
	    public static void main(String[] args) {
	        ArrayList<String> studentNames = new ArrayList<>();
	        studentNames.add("Jack");
	        studentNames.add("Paul");
	        studentNames.add("Henry");
	        studentNames.add("Mary");
	        studentNames.add("Ronaldo");

	        String nameToFind = "Henry";
	        String output = findName(studentNames, nameToFind);

	        System.out.println(output);
	    }
	    public static String findName(ArrayList<String> studentNames, String nameToFind) {
	        if (studentNames.contains(nameToFind)) {
	            return "Found";
	        } else {
	            return "Not found";
	        }
	    }
	}
