package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest2 {

	@Test(expected=IllegalArgumentException.class)
	public void testRemoveCarThrowIllegalArgmentExceptionIfThereIsNoCar() {
		Car car1 = new Car("BMW", 10000);
		Garage garage = new Garage();
		garage.remove(car1);
	}
	
	@Test
	public void testRemoveCar() {
		Car car1 = new Car("Tesla", 10000);
		Garage garage = new Garage();
		
		garage.ajouterVehicule(car1);
		garage.remove(car1);
		
		assertEquals(car1.getBrand(), "Tesla");
	}

}
