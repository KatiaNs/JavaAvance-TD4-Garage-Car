/**
 * 
 */
package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author user
 *
 */
public class GarageTest3 {

	@Test
	public void testRemoveBike() {
		Bike bike1 = new Bike("bike1", 100);
		Garage garage = new Garage();
		
		garage.ajouterVehicule(bike1);
		garage.remove(bike1);
		
		assertEquals(bike1.getBrand(), "bike1");
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testRemoveCarThrowIllegalArgmentExceptionIfThereIsNoCar() {
		Bike bike1 = new Bike("bike1", 100);
		Garage garage = new Garage();
		garage.remove(bike1);
	}
	
	
	@Test
	public void testProtectionismMethod() {
		Car car1 = new Car("Ford", 20000);
		Car car2 = new Car("Audi", 10000);
		Garage garage = new Garage();
	
		garage.ajouterVehicule(car1);
		garage.ajouterVehicule(car1);
		garage.ajouterVehicule(car2);
		garage.protectionism("Ford");
		
	}

}
