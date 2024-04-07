package com.learningcore.day1.session1.controlstruct.ps3;

public class D01P03p2 {
    public static void main(String[] args) {
        int[] weekNumbers = {2, -4, 9};

        for (int weekNumber : weekNumbers) {
            if (weekNumber == 1) {
                System.out.println("Monday");
            } else if (weekNumber == 2) {
                System.out.println("Tuesday");
            } else if (weekNumber == 3) {
                System.out.println("Wednesday");
            } else if (weekNumber == 4) {
                System.out.println("Thursday");
            } else if (weekNumber == 5) {
                System.out.println("Friday");
            } else if (weekNumber == 6) {
                System.out.println("Saturday");
            } else if (weekNumber == 7) {
                System.out.println("Sunday");
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}

