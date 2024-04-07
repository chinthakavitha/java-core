package com.Learning.core.day3session2.hashmap.ps8;

import java.util.Hashtable;

public class Mainp10 {
    public static void main(String[] args) {
        Hashtable<Integer, Employeep10> employeeTable = new Hashtable<>();
        // Predefined employee details
        employeeTable.put(1, new Employeep10(1, "John", "HR", "Manager"));
        employeeTable.put(2, new Employeep10(2, "Alice", "Finance", "Accountant"));
        employeeTable.put(3, new Employeep10(3, "Bob", "IT", "Developer"));
        employeeTable.put(4, new Employeep10(4, "Emma", "Marketing", "Analyst"));

        // Check if the HashTable is empty or not
        System.out.println(employeeTable.isEmpty());
    }
}
