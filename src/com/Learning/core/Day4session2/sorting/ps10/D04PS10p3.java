package com.Learning.core.Day4session2.sorting.ps10;

public class D04PS10p3 {
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40}; // Array elements
        // input 1 
        int target = 10; 
        //input 2
   //     int target = 10;
        // Perform linear search
        if (linearSearch(array, target)) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is Not Present");
        }
    }
}

