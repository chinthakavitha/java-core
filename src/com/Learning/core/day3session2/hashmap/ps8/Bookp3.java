package com.Learning.core.day3session2.hashmap.ps8;

class Bookp3 implements Comparable<Bookp3> {
  private String bookId;
  private String title;
  private double price;
  private String dateOfPublication;
  private String author;

  // Constructor to initialize book attributes
  public Bookp3(String bookId, String title, double price, String dateOfPublication, String author) {
    this.bookId = bookId;
    this.title = title;
    this.price = price;
    this.dateOfPublication = dateOfPublication;
    this.author = author;
  }

  // Getters and setters for all attributes 

  @Override
  public int compareTo(Bookp3 otherBook) {
    return this.bookId.compareTo(otherBook.bookId);
  }

  @Override
  public String toString() {
    return "Book{" +
            "bookId='" + bookId + '\'' +
            ", title='" + title + '\'' +
            ", price=" + price +
            ", dateOfPublication='" + dateOfPublication + '\'' +
            ", author='" + author + '\'' +
            '}';
  }
}