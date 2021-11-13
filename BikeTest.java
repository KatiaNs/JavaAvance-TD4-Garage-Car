package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

public class BikeTest {

	@Test(expected=IllegalArgumentException.class)
	public void throwExceptionIfValueNot100() {
		Bike bike1 = new Bike("Topbike", 100);
		Bike bike2 = new Bike("Topbike", 200);
		assertEquals(bike1.getValue(), bike2.getValue());
	}
	
}
