package com.learningcore.day2session1.string.ps5;
import java.util.Arrays;
public class D02P05p3 {


	

	    public static void main(String[] args) {
	        String input = "abc";
	        System.out.println("Subsequences of \"" + input + "\":");
	        printSubsequences(input);
	    }

	    public static void printSubsequences(String str) {
	        char[] charArray = str.toCharArray();
	        Arrays.sort(charArray); // Sorting the characters to print in lexicographical order
	        String sortedStr = new String(charArray);
	        generateSubsequences(sortedStr, 0, "");
	    }

	    private static void generateSubsequences(String str, int index, String current) {
	        if (index == str.length()) {
	            if (!current.isEmpty()) {
	                System.out.print(current);
	                if (index < str.length() - 1) {
	                    System.out.print(", ");
	                }
	            }
	            return;
	        }

	        // Include current character
	        generateSubsequences(str, index + 1, current + str.charAt(index));

	        // Exclude current character
	        if (!current.isEmpty()) {
	            System.out.print(", ");
	        }
	        generateSubsequences(str, index + 1, current);
	    }
	}

