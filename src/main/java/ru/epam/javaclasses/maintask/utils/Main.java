package ru.epam.javaclasses.maintask.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ru.epam.javaclasses.maintask.taxipool.TaxiPool;
import ru.epam.javaclasses.maintask.vehicle.Car;

public class Main {

	public static void main(String[] args) {
		TaxiPool taxiPool = new TaxiPool("Park", getCars());
		System.out.println("Choose action: " + "\n1 - get all cars of TaxiPool\n2 - get price of TaxiPool"
				+ "\n3 - get cars sorted by fuel consumption\n4 - find the car in the TaxiPool by the speed parameters");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		switch (i) {
		case (1):
			taxiPool.getCars().forEach(System.out::println);
			break;
		case (2):
			System.out.println("Price of TaxiPool " + taxiPool.getPriceTaxiPool() + " рублей");
			break;
		case (3):
			taxiPool.getCarsSortedByFuelConsumption().forEach(System.out::println);
			break;
		case (4):
			System.out.println("Enter min speed value: ");
			double minSpeedValue = scanner.nextDouble();
			System.out.println("Enter max speed value: ");
			double maxSpeedValue = scanner.nextDouble();
			System.out.println(taxiPool.getCarBySpeedParams(minSpeedValue, maxSpeedValue));
			break;
		default:
			System.out.println("Command is not found!");
			break;
		}
	}

	private static List<Car> getCars() {
		List<Car> cars = new ArrayList<>();
		List<String> strings = FileReader.readFile("cars.txt");
		for (String str : strings) {
			String[] s = str.split(" ");
			Car car = CarBuilder.getCar(Integer.parseInt(s[0]), s[1], s[2], Integer.parseInt(s[3]),
					Double.parseDouble(s[4]), Double.parseDouble(s[5]), Double.parseDouble(s[6]),
					Double.parseDouble(s[7]));
			cars.add(car);
		}
		return cars;
	}
}
