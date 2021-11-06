package fr.dauphine.javaavance.td4;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("BMW", 10000);
		Car car2 = new Car("Nissan", 20000);
		
		Garage garage = new Garage();
		
		garage.ajouterVoiture(car1);
		garage.ajouterVoiture(car2);
		//garage.ajouterVoiture(null);
		
		
		System.out.println(garage.toString());
		System.out.println(garage.valGarage());

	}

}
