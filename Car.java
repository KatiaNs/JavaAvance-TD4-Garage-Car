package fr.dauphine.javaavance.td4;

import java.io.IOException;

public class Car {
	private final String brand;
	private final long value;
	
	
	public Car(String brand, long value) {
		this.brand = brand;
		
		if(value < 0) {
			throw new IllegalArgumentException("Cannot create a car with a negative value");
		}
		
		else {
			this.value = value;
		}
	}
	
	public Car(String brand, long value, int vetuste) {
		this.brand = brand;
		
		value = value - (1000 * vetuste);
		
		
		if(value < 0) {
			throw new IllegalArgumentException("Cannot create a car with a negative value");
		}
		
		else {
			this.value = value;
		}
	}
	

	public String getBrand() {
		return brand;
	}

	public long getValue() {
		return value;
	}
	
	
	public String toString() {
		return "brand card: " + this.brand + ", its value: " + this.value;
	}
	
	
	
}
