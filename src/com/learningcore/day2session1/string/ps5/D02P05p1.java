package com.learningcore.day2session1.string.ps5;

public class D02P05p1 {

	    public static void main(String[] args) {
	        String[] inputs = {"madam", "teacher"};

	        for (String str : inputs) {
	            int len = str.length();
	            String upperStr = str.toUpperCase();

	            boolean isPalindrome = true;
	            for (int i = 0; i < len / 2; i++) {
	                if (upperStr.charAt(i) != upperStr.charAt(len - 1 - i)) {
	                    isPalindrome = false;
	                    break;
	                }
	            }
	            System.out.println(str + " is " + (isPalindrome ? "a palindrome" : "not a palindrome"));
	        }
	    }
	}


