package fr.dauphine.javaavance.td4;

import java.io.IOException;


public class Car implements Vehicules {
	private final String brand;
	private final long value;
	private Discount discount;


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
	
	
	public Car(String brand, long value, Discount discount) {
		this.brand = brand;
		this.discount = discount;

	
		this.value = value;
	
	}


	public String getBrand() {
		return this.brand;
	}

	public long getValue() {
		if(this.discount != null) {
			return (discount.getValue() / 100 ) * this.value;
		}
		return this.value;
	}


	public String toString() {
		return "brand car: " + this.brand + ", its value: " + this.value;
	}


	public boolean equals(Car c) {
		if(c instanceof Car) {
			Car car =  (Car) c;
			if(this.brand == car.getBrand() && this.value == car.getValue()) {
				return true;
			}
		}
		return false;


	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car car =  (Car) obj;
			if(this.brand == car.getBrand() && this.value == car.getValue()) {
				return true;
			}
		}
		return false;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + this.getValue());
		return result;
		
	}
	
	
	@Override
	public int compareTo(Object o) {
		Car c = (Car) o;
		return (getBrand()).compareTo(c.getBrand());
	}
	
	
	
	
	
}
