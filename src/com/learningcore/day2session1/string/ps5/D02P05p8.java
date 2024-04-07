package com.learningcore.day2session1.string.ps5;
import java.util.HashSet;

	public class D02P05p8 {
	    public static void main(String[] args) {
	    	//Input1
	        String input = "HelloWorld";
	    //    Input2
	     // String input = "aaabb";
	        String output = checkSplit(input);
	        System.out.println(output);
	    }

	    public static String checkSplit(String input) {
	        int len = input.length();
	        HashSet<String> set = new HashSet<>();

	        // Check all possible splits
	        for (int i = 1; i < len; i++) {
	            for (int j = i + 1; j < len; j++) {
	                for (int k = j + 1; k < len; k++) {
	                    String first = input.substring(0, i);
	                    String second = input.substring(i, j);
	                    String third = input.substring(j, k);
	                    String fourth = input.substring(k);

	                    set.clear();
	                    set.add(first);
	                    set.add(second);
	                    set.add(third);
	                    set.add(fourth);

	                    // If all substrings are distinct, return "Yes"
	                    if (set.size() == 4) {
	                        return "Yes";
	                    }
	                }
	            }
	        }

	        // If no split results in four distinct strings, return "No"
	        return "No";
	    }
	}

