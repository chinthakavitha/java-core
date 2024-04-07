package com.learningcore.day2session1.string.ps5;

public class D02P05p2 {

	    public static void main(String[] args) {
	        String str = "Testing";

	        int vowelCount = 2;
	        StringBuilder lastVowels = new StringBuilder(); // To store last vowels

	        for (int i = str.length() - 1; i >= 0; i--) {
	            char ch = str.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	                vowelCount++;
	                lastVowels.insert(0, ch); // Insert vowel at the beginning
	                if (vowelCount == 2) {
	                    break;
	                }
	            }
	        }

	        if (vowelCount < 2) {
	            System.out.println("Less than 2 vowels in the string");
	        } else {
	            System.out.println(lastVowels.toString());
	        }
	    }
	}

//output
//If the string has at least two vowels at the end, it will print "ei".
//If there are less than two vowels, it will print "Less than 2 vowels in the string".

