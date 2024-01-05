package com.example.techcareer.Vehicle;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Vehicle implements RentalStrategy{

    private String type;
    private String color;
    private int year;
    private String fuelType;

    public Vehicle(String type, String color, int year, String fuelType) {
        this.type = type;
        this.color = color;
        this.year = year;
        this.fuelType = fuelType;

    }

    @Override
    public double calculateDailyRent() {
        return 150.0;
    }

    @Override
    public double calculateMonthlyRent() {
        return calculateDailyRent()*30;
    }
}