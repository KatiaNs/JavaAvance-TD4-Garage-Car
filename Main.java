package fr.dauphine.javaavance.td4;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// Exercice1
		Car car1 = new Car("BMW", 10000);
		Car car2 = new Car("Nissan", 20000);
		Car car3 = new Car("BMW", 30000);		
		Car car4 = new Car("Seat", 10000, 2);
		Car carDiscount = new Car("Toyota", 30000, 10);
		
		Bike bike1 = new Bike("bike1", 100);
		Bike bike2 = new Bike("bike2", 100);
		Bike bike3 = new Bike("bike2", 100);



		Garage garage = new Garage();
		Garage garageTest = new Garage();

		//garage.ajouterVoiture(car1);
		//garage.ajouterVoiture(car2);
		//garage.ajouterVoiture(car3);
		//garage.ajouterVoiture(null);
		//garage.ajouterVoiture(car4);
		
		
		
		garage.ajouterVehicule(car1);
		garage.ajouterVehicule(bike1);
		garage.ajouterVehicule(bike2);
		garage.ajouterVehicule(bike3);
		garage.ajouterVehicule(carDiscount);

		System.out.println(garage.toString());
		System.out.println("The total value is: " + garage.valGarage());
		System.out.println("First car by brand is: " + garage.firstCarBrand("BMW"));
		System.out.println("First vehicule by brand is: " + garage.firstCarBrand("bike1"));
		System.out.println(bike1.toString());
		System.out.println(car4.toString());
		System.out.println("Discount: " + carDiscount.getValue());
		
		
		


		
		//garage.remove(car2);
		garage.remove(bike1);
		garage.protectionism("bike2");
		
		
	
		
		

		// Exercice2
		// 1- The behavior is not normal. the == method checks if the objects points to the same reference,
		// the .equals method compares the value of the objects and check if it is similar or not.
		// Here the b and c cars has the same values so with the .equals method, it should return true not false.
		// So to solve it we need to add the equals method.
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
		System.out.println(a==b); //false
		System.out.println(b==c); //false
		System.out.println(a==d); //true
		System.out.println(a.equals(b)); //false
		System.out.println(b.equals(c)); //true
		System.out.println(a.equals(d)); //true



		// 2- The behavior is not normal. We add a and b car to the list. a has the index 0 because
		// it is the first occurence, and b has the index 1 because it is the second occurence.
		// Since b and c have the same values (same brand and same value), the index of c should be 1
		// because it is the same as b and it should not return -1.
		// To solve this, we need to override the equals method and test if the values are the same
		// return true.
		ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		System.out.println(list.indexOf(a)); //0
		System.out.println(list.indexOf(b)); //1
		System.out.println(list.indexOf(c)); //1
		System.out.println(b.equals(c)); //true




		// 3- The behavior is not normal. We added b to the set, and then we check if the set 
		// contains c (where the values of it are equals to b).
		// The contains method returns true if set contains the specified element that is c.
		// In this case it should return true because b and c have the same values, but it is
		// returning false.
		// To solve this, we need to override the hashcode method in the Car class so it will
		// return true.
		HashSet<Car> set = new HashSet<Car>();
		set.add(b);
		System.out.println(set.contains(c)); //true





	}

}
