package com.Learning.core.day3session1.collectionsPs7;
import java.util.TreeSet;

class Personps6 implements Comparable<Personps6> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Personps6(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personps6 person = (Personps6) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Personps6 person) {
        return Integer.compare(this.id, person.id);
    }
}
