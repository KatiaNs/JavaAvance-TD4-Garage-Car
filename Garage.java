package fr.dauphine.javaavance.td4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Garage {
	private Car car;
	private ArrayList<Car> list;
	private ArrayList<Vehicules> listVehicule;
	private static int idGarage;

	public Garage() {
		list = new ArrayList<Car>();
		listVehicule = new ArrayList<Vehicules>();
		car = new Car("", 0);
		idGarage++;
	}


	public void ajouterVoiture(Car car) {

		list.add(Objects.requireNonNull(car, "Car cannot be a null value"));

	}

	public void ajouterVehicule(Vehicules vehicule) {
		
		listVehicule.add(Objects.requireNonNull(vehicule, "Car cannot be a null value"));
		//Collections.sort((List<T>) listVehicule);

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
		int somme = 0;
		for(int i=0; i<listVehicule.size(); i++) {
			somme+= listVehicule.get(i).getValue();
		}
		return somme;
	}


	public String firstCarBrand(String brandCar) {

		for(int i=0; i<listVehicule.size(); i++) {
			if(listVehicule.get(i).getBrand() == brandCar) {
				return listVehicule.get(i).getBrand();
			}
		}

		throw new IllegalArgumentException("Brand car does not exists");
		//return null;
	}


	public Vehicules remove(Vehicules vehicule) {
		for(int i=0; i<listVehicule.size(); i++) {
			if(listVehicule.get(i) == vehicule) {
				System.out.println("vehicule removed");
				return listVehicule.remove(i);

			}
			System.out.println("vehicule not removed");
		}
		//return vehicule;
		throw new IllegalArgumentException("Brand car does not exists");
	}


	public void protectionism(String brand) {
		Iterator<Vehicules> it = listVehicule.iterator();
		while (it.hasNext()) {

			if(it.next().getBrand() == brand) {
				System.out.println("vehicule in protectionism removed");
				it.remove();
			}
		}

		System.out.println("vehicule in protectionism not removed");
	}


	// Exercice4- 2-- it doesn't consider if we added vehicules in different order in the list
	public boolean equals(Garage g) {
		return listVehicule.equals(g);
	}







}
