package com.learningcore.day2session1.string.ps5;

public class D02P05p6 {
	    public static void main(String[] args) {
//	     Input:1
	    	String s = "abcab";
//		     Input:2
//	        String s = "aabcdaabc";
	        int length = longestPrefixSuffix(s);
	        System.out.println(length);
	    }
	    public static int longestPrefixSuffix(String s) {
	        int n = s.length();
	        int longestPrefixSuffixLength = 0;

	        // Check for all possible lengths of prefix and suffix
	        for (int i = 0; i < n / 2; i++) {
	            String prefix = s.substring(0, i + 1);
	            String suffix = s.substring(n - 1 - i, n);
	            if (prefix.equals(suffix)) {
	                longestPrefixSuffixLength = i + 1;
	            }
	        }
	        return longestPrefixSuffixLength;
	    }
	}
