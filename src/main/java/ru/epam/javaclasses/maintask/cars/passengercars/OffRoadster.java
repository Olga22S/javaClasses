package ru.epam.javaclasses.maintask.cars.passengercars;

import ru.epam.javaclasses.maintask.cars.Car;

public class OffRoadster extends Car{

	public OffRoadster() {
		super();
	}

	public OffRoadster(int id, String brand, String model, int passengerCapacity, double cargoCapacity,
			double fuelConsumption, double averageSpeed, double carPrice) {
		super(id, brand, model, passengerCapacity, cargoCapacity, fuelConsumption, averageSpeed, carPrice);
	}
}
