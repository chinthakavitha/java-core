package com.learningcore.day1.session2.Array.ps4;

public class D01Po4p4 {

	    // in arr[] from index start
	    static void combinationUtil(int arr[], int n, int r, int index,
	                                int data[], int i) {
	        if (index == r) {
	            for (int j = 0; j < r; j++)
	                System.out.print(data[j] + " ");
	            System.out.println();
	            return;
	        }

	        // If we reach end and r is not filled, then this
	        // combination is invalid
	        if (i >= n)
	            return;

	        // First include current element in data[] view
	        // and recur
	        data[index] = arr[i];
	        combinationUtil(arr, n, r, index + 1, data, i + 1);

	        // Then exclude current element in data[] view
	        // and recur
	        combinationUtil(arr, n, r, index, data, i + 1);
	    }

	    // Wrapper function to print all combinations of size r
	    // in arr[]
	    static void printCombination(int arr[], int n, int r) {
	        int data[] = new int[r];

	        // Print all combination possibilities
	        combinationUtil(arr, n, r, 0, data, 0);
	    }

//	     Driver function to test above functions 
	    public static void main(String[] args) {
	        int arr[] = {1, 2, 3};
	        int r = 2;
	        int n = arr.length;

	        printCombination(arr, n, r);
	    }
	}
