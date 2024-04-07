package com.learningcore.day2session1.string.ps5;
	public class D02P05p9 {
	    public static void main(String[] args) {
	        String input = "Mr John Smith";
	        String replaced = replaceSpaces(input);
	        System.out.println(replaced);
	    }

	    public static String replaceSpaces(String input) {
	        StringBuilder sb = new StringBuilder();
	        for (char ch : input.toCharArray()) {
	            if (ch == ' ') {
	                sb.append("%20");
	            } else {
	                sb.append(ch);
	            }
	        }

	        return sb.toString();
	    }
	}

