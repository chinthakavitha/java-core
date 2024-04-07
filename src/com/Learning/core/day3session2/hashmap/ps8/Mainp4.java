package com.Learning.core.day3session2.hashmap.ps8;

import java.util.TreeSet;

public class Mainp4 {
    public static void main(String[] args) {
        TreeSet<Bookp4> books = new TreeSet<>();
        // Predefined book details
        books.add(new Bookp4(1003, "Java Programming", 715.0, "23/11/1984", "Gilad Bracha"));
        books.add(new Bookp4(1004, "Read C++", 295.0, "19/11/1984", "Henry Harvin"));
        books.add(new Bookp4(1005, ".Net Platform", 3497.0, "2/2/2020", "Mark J. Price"));
        books.add(new Bookp4(1001, "Python Learning", 523.0, "19/5/1997", "Martic C. Brown"));
        books.add(new Bookp4(1002, "Modern Mainframe", 295.0, "6/3/1984", "Sharad"));

        // Print all book details sorted by author names
        for (Bookp4 book : books) {
            System.out.println(book);
        }
    }
}
