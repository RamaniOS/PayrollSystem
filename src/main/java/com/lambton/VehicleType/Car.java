/*
Created by: Nitin Jaswal
 */
package com.lambton.VehicleType;

import com.lambton.Vehicle.Vehicle;

import java.time.LocalDate;

/// This is the Car class inherited from parent class 'Vehicle', containing the information of vehicle type car.
public class Car extends Vehicle {

    public enum FuelType {
        petrol, diesel, gas, Tesla
    }
    /** Properties*/
    protected float price;
    protected int seater;
    protected FuelType fuelType;

    /** Constructor*/
    public Car(String manufacturer, String plateNo, String model, LocalDate insuranceDate, float milage, VehicleType vehicleType, float price, int seater, FuelType fuelType) {
        super(manufacturer, plateNo, model, insuranceDate, milage, vehicleType);
        this.price = price;
        this.seater = seater;
        this.fuelType = fuelType;
    }

    /** Getter - Setter*/
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getSeater() {
        return seater;
    }

    public void setSeater(int seater) {
        this.seater = seater;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    /** Helper Method*/
    @Override
    public float calculateInsuranceStatus() {

        return 0;
    }
}
