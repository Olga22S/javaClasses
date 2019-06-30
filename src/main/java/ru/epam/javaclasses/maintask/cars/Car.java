package ru.epam.javaclasses.maintask.cars;

public abstract class Car {

	private int id;
	private String brand;
	private String model;
	private int passengerCapacity;
	private double cargoCapacity;
	private double fuelConsumption;
	private double averageSpeed;
	private double carPrice;

	public Car() {
		
	}
	
	public Car(int id, String brand, String model, int passengerCapacity, double cargoCapacity, double fuelConsumption,
			double averageSpeed, double carPrice) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.passengerCapacity = passengerCapacity;
		this.cargoCapacity = cargoCapacity;
		this.fuelConsumption = fuelConsumption;
		this.averageSpeed = averageSpeed;
		this.carPrice = carPrice;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public double getAverageSpeed() {
		return averageSpeed;
	}

	public void setAverageSpeed(double averageSpeed) {
		this.averageSpeed = averageSpeed;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Car)) {
			return false;
		}
		Car other = (Car) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return brand + " " + model;
	}
}
