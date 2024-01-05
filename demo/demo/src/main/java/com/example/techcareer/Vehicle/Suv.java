package com.example.techcareer.Vehicle;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Suv extends Vehicle {

    private int trunkCapacity;
    private int year;
    public Suv(String type, String color, int year, int trunkCapacity, String fuelType){
        super(type,color,year,fuelType);
        this.trunkCapacity = trunkCapacity;
        this.year = year;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public double calculateDailyRent() {
        if (year >= 2016){
            return super.calculateDailyRent() + 250;
        }
        else{
            return super.calculateDailyRent() + 150;
        }

    }

    @Override
    public double calculateMonthlyRent() {
        if (year >= 2016){
            return (super.calculateDailyRent() + 250)*30;
        }
        else {
            return (super.calculateDailyRent() + 150) * 30;
        }
    }
}