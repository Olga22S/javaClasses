package ru.epam.javaclasses.maintask.cars.cargocars;

import ru.epam.javaclasses.maintask.cars.Car;

public class Transporter extends Car {

	public Transporter() {
		super();
	}

	public Transporter(int id, String brand, String model, int passengerCapacity, double cargoCapacity,
			double fuelConsumption, double averageSpeed, double carPrice) {
		super(id, brand, model, passengerCapacity, cargoCapacity, fuelConsumption, averageSpeed, carPrice);
	}
}
