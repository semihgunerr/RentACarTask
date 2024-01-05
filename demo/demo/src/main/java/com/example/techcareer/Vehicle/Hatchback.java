package com.example.techcareer.Vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hatchback extends Vehicle {
    private int trunkCapacity;

    public Hatchback(String type, String color, int year, int trunkCapacity, String fuelType) {
        super(type, color, year, fuelType);
        this.trunkCapacity = trunkCapacity;
    }

    public int getCargoCapacity() {
        return trunkCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.trunkCapacity = cargoCapacity;
    }

    @Override
    public double calculateDailyRent() {
        return super.calculateDailyRent() + 150;
    }

    @Override
    public double calculateMonthlyRent() {
        return (super.calculateDailyRent() + 150)*30;
    }
}