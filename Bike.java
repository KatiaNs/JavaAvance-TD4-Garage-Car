package fr.dauphine.javaavance.td4;

public class Bike implements Vehicules {
	private String brand;
	private final int value = 100;
	private Discount discount;

	public Bike(String brand, int value) {
		this.brand = brand;

		if(value != this.value) {
			throw new IllegalArgumentException("Bike value must be 100");
		}


	}

	public Bike(String brand, int value, Discount discount) {
		this.brand = brand;
		this.discount = discount;

		if(value != this.value) {
			throw new IllegalArgumentException("Bike value must be 100");
		}


	}


	public String getBrand() {
		return this.brand;
	}


	public long getValue() {
		if(this.discount != null) {
			return (discount.getValue() / 100) * this.value;
		}
		return this.value;
	}


	public String toString() {
		return "brand bike: " + this.brand + ", its value: " + this.value;
	}

	@Override
	public int compareTo(Object o) {
		Bike bike = (Bike) o;
		return (getBrand()).compareTo(bike.getBrand());
	}


}
