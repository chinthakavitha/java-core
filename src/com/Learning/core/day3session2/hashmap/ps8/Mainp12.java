package com.Learning.core.day3session2.hashmap.ps8;

import java.util.Hashtable;
public class Mainp12 {
    public static void main(String[] args) {
        Hashtable<Integer, Employeep12> employeeTable = new Hashtable<>();
        // Predefined employee details
        employeeTable.put(1001, new Employeep12(1001, "Daniel", "L&D", "Analyst"));
        employeeTable.put(1003, new Employeep12(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1004, new Employeep12(1004, "Grace", "HR", "Tech Support"));

        // Add new employees if they do not exist
        addEmployeeIfNotExists(employeeTable, new Employeep12(1002, "Thomas", "Testing", "Tester"));
        addEmployeeIfNotExists(employeeTable, new Employeep12(1005, "Charles", "Testing", "QA Lead"));

        // Display all employees
        for (Employeep12 employee : employeeTable.values()) {
            System.out.println(employee);
        }
    }

    private static void addEmployeeIfNotExists(Hashtable<Integer, Employeep12> employeeTable, Employeep12 employee) {
        if (!employeeTable.containsKey(employee.getId())) {
            employeeTable.put(employee.getId(), employee);
        }
    }
}