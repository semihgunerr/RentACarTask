package com.example.techcareer;

import com.example.techcareer.Customers.Customer;
import com.example.techcareer.Customers.User;
import com.example.techcareer.Vehicle.Hatchback;
import com.example.techcareer.Vehicle.Sedan;
import com.example.techcareer.Vehicle.Suv;
import com.example.techcareer.Vehicle.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class TechCareerBootcampRentACarApplication {


	public static void main(String[] args) {
		SpringApplication.run(TechCareerBootcampRentACarApplication.class, args);


		Customer individualCustomer = new Customer("Individual", "Semih Güner", "123456789");
		Customer corporateCustomer = new Customer("Corporate", "SG Corp", "987654321");


		User individualUser = new User("Individual", "semih_güner", "password123");
		User corporateUser = new User("Corporate", "sg_corp", "securepass");


		Hatchback hatchback = new Hatchback("HatchbackModel", "Blue", 2012, 200, "Gasoline");
		Sedan sedan = new Sedan("SedanModel", "Red", 2019, "Diesel");
		Suv suv = new Suv("SUVModel", "Black", 2020, 500, "Electric");


		int rentalDays = 10;

		List<Vehicle> availableVehiclesForIndividual = filterVehicles(individualUser, List.of(hatchback, sedan, suv));
		List<Vehicle> availableVehiclesForCorporate = filterVehicles(corporateUser, List.of(hatchback, sedan, suv));


		rentVehicles(individualUser, availableVehiclesForIndividual, rentalDays);
		rentVehicles(corporateUser, availableVehiclesForCorporate, rentalDays);
	}

	private static List<Vehicle> filterVehicles(User user, List<Vehicle> vehicles) {
		List<Vehicle> filteredVehicles = new ArrayList<>();

		for (Vehicle vehicle : vehicles) {
			if ("Individual".equals(user.getUserType()) && vehicle instanceof Hatchback) {
				filteredVehicles.add(vehicle);
			} else if ("Corporate".equals(user.getUserType())) {
				filteredVehicles.add(vehicle);
			}
		}

		return filteredVehicles;
	}

	// Rent vehicles
	private static void rentVehicles(User user, List<Vehicle> vehicles, int rentalDays) {
		System.out.println(user.getUserType() + " " + user.getUsername() + " is renting vehicles:" + "\n" );

		for (Vehicle vehicle : vehicles) {
			double rentalCost = vehicle.calculateDailyRent();
			System.out.println("Model: " + vehicle.getType() + "," + " Color: " + vehicle.getColor() + "," + " Year: " + vehicle.getYear() +  "," +" Fuel Type: " + vehicle.getFuelType() +  "," + " Rental Cost: $" + rentalCost + " (Daily)");

			double monthlyRentalCost = vehicle.calculateMonthlyRent();
			System.out.println("Model: " + vehicle.getType() + "," + " Color: " + vehicle.getColor() + "," + " Year: " + vehicle.getYear() +  "," +" Fuel Type: " + vehicle.getFuelType() +  "," + " Rental Cost: $" + monthlyRentalCost + " (Monthly)");
		}

	}

	}


