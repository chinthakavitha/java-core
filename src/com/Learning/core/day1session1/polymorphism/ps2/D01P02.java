package com.Learning.core.day1session1.polymorphism.ps2;

class TestClass{
	public static void main(String [] args) {
		MedicineInfo medicine1 = new Tablet();
		MedicineInfo medicine2 = new Syrup();
		MedicineInfo medicine3 = new Ointment();
		
		medicine1.displayLabel();
		medicine2.displayLabel();
		medicine3.displayLabel();
		
	}
}
