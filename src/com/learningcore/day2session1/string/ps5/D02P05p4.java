package com.learningcore.day2session1.string.ps5;

public class D02P05p4 {
	    public static void main(String[] args) {
	        String input = "aebcda";
	        int deletions = minDeletionsToPalindrome(input);
	        System.out.println("Minimum deletions to make \"" + input + "\" a palindrome: " + deletions);
	    }

	    public static int minDeletionsToPalindrome(String s) {
	        int n = s.length();
	        // Create a 2D array to store the length of the LPS for substrings
	        int[][] dp = new int[n][n];

	        // Initialize the diagonal elements to 1 (single character is always a palindrome)
	        for (int i = 0; i < n; i++) {
	            dp[i][i] = 1;
	        }

	        // Build the LPS array using dynamic programming
	        for (int l = 2; l <= n; l++) {
	            for (int i = 0; i < n - l + 1; i++) {
	                int j = i + l - 1;
	                if (s.charAt(i) == s.charAt(j)) {
	                    dp[i][j] = dp[i + 1][j - 1] + 2;
	                } else {
	                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
	                }
	            }
	        }

	        // Minimum deletions = length of string - LPS length
	        return n - dp[0][n - 1];
	    }
	}
