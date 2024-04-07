package com.Learning.core.day3session2.hashmap.ps8;

import java.util.Set;
import java.util.TreeSet;

public class BookStorep3 {

	  public static void main(String[] args) {
	    Set<Bookp3> books = new TreeSet<>();

	    books.add(new Bookp3("1001", "Python Learning", 295.0, "19/5/1997", "Sharad"));
	    books.add(new Bookp3("1002", "Modern Mainframe", 0.0, "NA", "NA"));
	    books.add(new Bookp3("1003", "Java Programming", 523.0, "23/11/1984", "Gilad Bracha"));
	    books.add(new Bookp3("1004", "Read C++", 295.0, "19/11/1984", "Henry Harvin"));
	    books.add(new Bookp3("1005", ".Net Platform", 3497.0, "6/3/1984", "Mark J. Price"));

	    for (Bookp3 book : books) {
	      System.out.println(book);
	    }
	  }
	}