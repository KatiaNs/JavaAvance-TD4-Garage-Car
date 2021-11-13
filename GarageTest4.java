package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest4 {

	@Test
	public void garageEquality() {
		// Exercice4- It is comparing the references of these instances
		Garage garage1 = new Garage();
		Garage garage2 = new Garage();

		Car car1 = new Car("BMW", 90000);
		Car car2 = new Car("Lada", 6500, 2);
		Car car3 = new Car("Lada", 5500, 1);
		Bike bike1 = new Bike("Scott", 100);
		Bike bike2 = new Bike("Merlin", 100, new Discount(50));
		Bike bike3 = new Bike("Merlin", 100);

		garage1.ajouterVehicule(car1);
		garage1.ajouterVehicule(bike1);
		garage1.ajouterVehicule(car2);
		garage1.ajouterVehicule(bike2);
		garage1.ajouterVehicule(car3);        
		garage1.ajouterVehicule(bike3);

		garage2.ajouterVehicule(bike1);
		garage2.ajouterVehicule(car1);    
		garage2.ajouterVehicule(car3); 
		garage2.ajouterVehicule(car2);
		garage2.ajouterVehicule(bike3);
		garage2.ajouterVehicule(bike2);       

		assertEquals(garage1, garage2);
	}

}
