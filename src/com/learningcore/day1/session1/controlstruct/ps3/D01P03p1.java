package com.learningcore.day1.session1.controlstruct.ps3;

public class D01P03p1 {

	    public static void main(String[] args) {
	        int[] monthNumbers = {3, -2, 14};
	        String[] monthNames = new String[monthNumbers.length];

	        for (int i = 0; i < monthNumbers.length; i++) {
	            int monthNumber = monthNumbers[i];
	            switch (monthNumber) {
	                case 1:
	                    monthNames[i] = "January";
	                    break;
	                case 2:
	                    monthNames[i] = "February";
	                    break;
	                case 3:
	                    monthNames[i] = "March";
	                    break;
	                // ... other month cases
	                case 12:
	                    monthNames[i] = "December";
	                    break;
	                default:
	                    monthNames[i] = "Invalid Input";
	            }
	        }

	        // Print the results
	        for (int i = 0; i < monthNames.length; i++) {
	            System.out.println(monthNames[i]);
	        }
	    }
	}

