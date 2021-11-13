package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.dauphine.javaavance.td3.MyList;

public class GarageTest {
	
	@Test
	public void TestSizeOfIdGarage() {
		Garage garage = new Garage();
		Garage garage2 = new Garage();
		
		assertEquals(2, garage2.getIdGarage());
	}

	@Test(expected=NullPointerException.class)
	public void checkIfCarAddedIsNullThenThrowNullPointerException() {
		Garage garage = new Garage();
		garage.ajouterVoiture(null);
		
	}
	

	@Test(expected=IllegalArgumentException.class)
	public void testIfTheFirstCarBrandDoesNotExistThenThrowIllegalArgumentException() {
		Garage garage = new Garage();
		Car car = new Car("BMW", 1000);
		
		garage.ajouterVoiture(car);
		assertEquals(car.getBrand(), garage.firstCarBrand("Audi"));
	}

}
