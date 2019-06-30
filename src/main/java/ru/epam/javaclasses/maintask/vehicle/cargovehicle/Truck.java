package ru.epam.javaclasses.maintask.vehicle.cargovehicle;

import ru.epam.javaclasses.maintask.vehicle.Car;

public class Truck extends Car {

	public Truck() {
		super();
	}

	public Truck(int id, String brand, String model, int passengerCapacity, double cargoCapacity,
			double fuelConsumption, double averageSpeed, double carPrice) {
		super(id, brand, model, passengerCapacity, cargoCapacity, fuelConsumption, averageSpeed, carPrice);
	}
}
