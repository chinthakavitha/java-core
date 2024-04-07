package com.Learning.core.day3session1.collectionsPs7;
import java.util.TreeSet;
import java.util.Iterator;

	class Personp5 implements Comparable<Personp5 > {
	    private int id;
	    private String name;
	    private int age;
	    private double salary;

	    public Personp5(int id, String name, int age, double salary) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }
	    public int getAge() {
	        return age;
	    }

	    @Override
	    public int compareTo(Personp5 other) {
	        return Integer.compare(this.id, other.id);
	    }

	    @Override
	    public String toString() {
	        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
	    }
	}

	