package com.Learning.core.day1session1.Object.ps1;

 //insted of taking class name as book am taking class name as D01P01
public class D01P01 {
	
	private String bookTitle;
	private double bookPrice;
	
     //getters for bookTitle and bookprice
	public String getBookTitle() {
		return bookTitle;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	//setters for booktitle and bookprice
	
	public void setBookTitle(String title) {
		if(title.isEmpty()|| title ==null) {
			throw new IllegalArgumentException("Book title cannot be empty");
		}
		bookTitle = title;
	}
	public void setBookPrice(double price) {
		if(price <0) {
			throw new IllegalArgumentException ("Book price cannot be negative");
		}
		bookPrice = price;
	}
	//contructor
	public D01P01(String title, double price) {
		setBookTitle(title);
		setBookPrice(price);
	}
public class CreateAndShowBook{
	public static void main(String[] args) {
		//creating a book object
		D01P01 book1 = new D01P01("java Programming",350.00);
		
		//Displaying book details using getter and setter
		System.out.println("book Title: "+ book1.getBookTitle()+" and price:"+book1.getBookPrice());
}
	}
}
