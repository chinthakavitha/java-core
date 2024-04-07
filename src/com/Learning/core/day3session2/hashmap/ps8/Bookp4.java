package com.Learning.core.day3session2.hashmap.ps8;


class Bookp4 implements Comparable<Bookp4> {
    private int bookId;
    private String title;
    private double price;
    private String dateOfPublication;
    private String author;

    public Bookp4(int bookId, String title, double price, String dateOfPublication, String author) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.dateOfPublication = dateOfPublication;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Price: " + price + ", Date of Publication: " + dateOfPublication + ", Author: " + author;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + bookId;
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
        Bookp4 other = (Bookp4) obj;
        if (bookId != other.bookId)
            return false;
        return true;
    }

    @Override
    public int compareTo(Bookp4 other) {
        return this.author.compareTo(other.author);
    }
}

