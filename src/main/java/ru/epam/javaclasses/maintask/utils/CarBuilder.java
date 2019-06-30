package ru.epam.javaclasses.maintask.utils;

import ru.epam.javaclasses.maintask.vehicle.Car;
import ru.epam.javaclasses.maintask.vehicle.cargovehicle.*;
import ru.epam.javaclasses.maintask.vehicle.passengervehicle.*;

public class CarBuilder {

	public static Car getCar(int id, String brand, String model, int passengerCapacity, double cargoCapacity,
			double fuelConsumption, double averageSpeed, double carPrice) {
		switch (model) {
		case "Minivan":
			return new Minivan(id, brand, model, passengerCapacity, cargoCapacity, fuelConsumption, averageSpeed,
					carPrice);
		case "OffRoadster":
			return new OffRoadster(id, brand, model, passengerCapacity, cargoCapacity, fuelConsumption, averageSpeed,
					carPrice);
		case "Sedan":
			return new Sedan(id, brand, model, passengerCapacity, cargoCapacity, fuelConsumption, averageSpeed,
					carPrice);
		case "Transporter":
			return new Transporter(id, brand, model, passengerCapacity, cargoCapacity, fuelConsumption, averageSpeed,
					carPrice);
		case "Truck":
			return new Truck(id, brand, model, passengerCapacity, cargoCapacity, fuelConsumption, averageSpeed,
					carPrice);
		default:
			return null;
		}
	}
}
