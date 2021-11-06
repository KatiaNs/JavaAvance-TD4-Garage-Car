package fr.dauphine.javaavance.td4;

import java.util.ArrayList;
import java.util.Objects;

public class Garage {
	//assertequals()
	//assertnull()
	//assertthrows()
	private Car car;
	private ArrayList<Car> list;
	private static int idGarage;

	public Garage() {
		list = new ArrayList<Car>();
		idGarage++;
	}
	
	public Garage(Car car) {
		this.car = car;
		list = new ArrayList<Car>();
		idGarage++;
	}

	public void ajouterVoiture(Car car) {

		list.add(Objects.requireNonNull(car, "Car cannot be a null value"));

	}

	public int getIdGarage() {
		return idGarage;
	}

	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(idGarage);

		return "id garage: " + strBuilder.toString();
	}

	public int valGarage() {
		// nb de voiture pas size
		int somme = 0;
		for(int i=0; i<list.size(); i++) {
			somme+= car.getValue();
		}
		return somme;
	}

	
	public Car firstCarBrand(String brandCar) {
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getBrand() == brandCar) {
				return list.get(i);
			}
		}
		
		return null;
	}
	


}
