package com.learningcore.day1.session2.Array.ps4;

public class D01P04p2 {
	    public static void main(String[] args) {
	        int[] A = {2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 3, 0, 0, 0};
	        
	        // elements from index 0 to 14 and store it at element 15
	        int sum = 0;
	        for (int i = 0; i < 15; i++) {
	            sum += A[i];
	        }
	        A[15] = sum;
	        
	        //average of all numbers and store it at element 16
	        double average = (double) sum / 15;
	        A[16] = (int) Math.round(average);
	        
	        // smallest value from the array and store it at element 17
	        int min = A[0];
	        for (int i = 1; i < 15; i++) {
	            if (A[i] < min) {
	                min = A[i];
	            }
	        }
	        A[17] = min;
	        
	        // Output the array
	        System.out.println("");
	        for (int i = 0; i < A.length; i++) {
	            System.out.print(A[i] + " ");
	        }
	    }
	}

