package com.Learning.core.day3session1.collectionsPs7;

import java.util.TreeSet;

class Personps8 implements Comparable<Personps8> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Personps8(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personps8 other = (Personps8) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int compareTo(Personps8 o) {
        return Integer.compare(this.id, o.id);
    }
}
