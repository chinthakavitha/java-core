package com.Learning.core.day1session1.polymorphism.ps2;

class Syrup implements MedicineInfo{
	@Override
	public void displayLabel() {
		System.out.println("Syrup is consumable only on prescription.");
}
}
