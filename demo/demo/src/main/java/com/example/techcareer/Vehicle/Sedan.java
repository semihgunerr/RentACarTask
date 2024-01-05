package com.example.techcareer.Vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sedan extends Vehicle {

    public Sedan(String type, String color, int year, String fuelType){
        super(type, color, year, fuelType);
    }

    @Override
    public double calculateDailyRent() {
        return super.calculateDailyRent()+200;
    }

    @Override
    public double calculateMonthlyRent() {
        return (super.calculateDailyRent() + 200)*30;
    }
}
