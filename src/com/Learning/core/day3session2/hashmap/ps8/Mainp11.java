package com.Learning.core.day3session2.hashmap.ps8;
import java.util.Hashtable;
public class Mainp11 {
    public static void main(String[] args) {
        Hashtable<Integer, Employeep11> employeeTable = new Hashtable<>();
        // Predefined employee details
        employeeTable.put(1001, new Employeep11(1001, "John", "HR", "Manager"));
        employeeTable.put(1002, new Employeep11(1002, "Alice", "Finance", "Accountant"));
        employeeTable.put(1003, new Employeep11(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1004, new Employeep11(1004, "Emma", "Marketing", "Analyst"));

        // Search for a specific Employee
        int searchId = 1003;
        Employeep11 searchedEmployee = employeeTable.get(searchId);
        if (searchedEmployee != null) {
            System.out.println(searchedEmployee);
        } else {
            System.out.println("Employee not found");
        }
    }
}
