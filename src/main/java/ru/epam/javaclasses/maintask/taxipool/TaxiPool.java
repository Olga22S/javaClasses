package ru.epam.javaclasses.maintask.taxipool;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ru.epam.javaclasses.maintask.vehicle.Car;

public class TaxiPool {

	private String name;
	private List<Car> cars;

	public TaxiPool(String name, List<Car> cars) {
		super();
		this.name = name;
		this.cars = cars;
	}

	public double getPriceTaxiPool() {
		return cars.stream().mapToDouble(s -> s.getCarPrice()).sum();
	}

	public Car getCarBySpeedParams(double fromSpeed, double toSpeed) {
		return cars.stream().filter(c -> c.getAverageSpeed() >= fromSpeed && c.getAverageSpeed() <= toSpeed).findFirst()
				.get();
	}

	public List<Car> getCarsSortedByFuelConsumption() {
		return cars.stream().sorted(Comparator.comparing(Car::getFuelConsumption)).collect(Collectors.toList());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "TaxiPool: " + name + ", cars: " + cars;
	}
}
