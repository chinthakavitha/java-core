package com.learningcore.day1.session2.Array.ps4;

public class D01P04P1 {
	    public static void main(String[] args) {
	        int[] bingoArray = {7, 25, 5, 19, 30};

	        // 1: Bingo (numbers not found in array)
	        int firstNumber1 = 20;
	        int secondNumber1 = 1;
	        boolean foundBoth1 = checkNumbers(bingoArray, firstNumber1, secondNumber1);
	        System.out.println((foundBoth1 ? " its Bingo" : "Not Found"));

	        // 2: Found (numbers not in array)
	        int firstNumber2 = 7;
	        int secondNumber2 = 25;
	        boolean foundBoth2 = checkNumbers(bingoArray, firstNumber2, secondNumber2);
	        System.out.println( (foundBoth2 ? "its Bingo!" : "Not Found"));
	    }

	    public static boolean checkNumbers(int[] array, int num1, int num2) {
	        boolean foundFirst = false, foundSecond = false;
	        for (int element : array) {
	            if (element == num1) {
	                foundFirst = true;
	            } else if (element == num2) {
	                foundSecond = true;
	            }
	        }
	        return foundFirst && foundSecond; // Both numbers must be found for Bingo
	    }
	}




