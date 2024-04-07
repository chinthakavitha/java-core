package com.Learning.core.day3session1.collectionsPs7;

import java.util.TreeSet;

class Personps9 implements Comparable<Personps9> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Personps9(int id, String name, int age, double salary) {
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

    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
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
        Personps9 other = (Personps9) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int compareTo(Personps9 o) {
        return Integer.compare(this.id, o.id);
    }
}
