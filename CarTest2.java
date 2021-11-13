package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest2 {

	@Test
	public void testEqualsMethod() {
		Car car1 = new Car("Audi", 20000);
		Car car2 = new Car("Audi", 20000);
		
		assertTrue(car1.equals(car2));
	}
	
	

}
