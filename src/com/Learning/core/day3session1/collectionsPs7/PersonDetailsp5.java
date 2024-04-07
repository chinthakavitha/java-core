package com.Learning.core.day3session1.collectionsPs7;
import java.util.Iterator;
import java.util.TreeSet;

	public class PersonDetailsp5 {
	    public static void main(String[] args) {
	        TreeSet<Personp5> people = new TreeSet<>();
	        people.add(new Personp5(1, "Alice", 22, 1500.0));
	        people.add(new Personp5(2, "Bob", 30, 2000.0));
	        people.add(new Personp5(3, "Charlie", 28, 2500.0));
	        people.add(new Personp5(4, "David", 24, 1800.0));
	        people.add(new Personp5(5, "John", 32, 1999.0));
	        people.add(new Personp5(6, "Tom", 42, 3999.0));

	        // Use an iterator to traverse the TreeSet in reverse order
	        Iterator<Personp5> it = people.descendingIterator();
	        while (it.hasNext()) {
	        	Personp5 person = it.next();
	            if (person.getAge() > 30) {
	                System.out.println(person);
	            }
	        }
	    }
	}
