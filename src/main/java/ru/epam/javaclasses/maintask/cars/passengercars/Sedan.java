package ru.epam.javaclasses.maintask.cars.passengercars;

import ru.epam.javaclasses.maintask.cars.Car;

public class Sedan extends Car{

	public Sedan() {
		super();
	}

	public Sedan(int id, String brand, String model, int passengerCapacity, double cargoCapacity,
			double fuelConsumption, double averageSpeed, double carPrice) {
		super(id, brand, model, passengerCapacity, cargoCapacity, fuelConsumption, averageSpeed, carPrice);
	}
}
