/*
Created by: Nitin Jaswal
 */
package com.lambton.VehicleType;

import com.lambton.Vehicle.Vehicle;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

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
    public String calculateInsuranceStatus() {

        //LocalDateTime from = getInsuranceDate();
        LocalDate from = LocalDate.parse("2019-06-21");
//
        LocalDate to = LocalDate.parse("2019-08-21");

        LocalDate fromTemp = LocalDate.from(from);
        // diff years
        long years = fromTemp.until(to, ChronoUnit.YEARS);

        // fromTemp = fromTemp.plusYears(years);

        long months = fromTemp.until(to, ChronoUnit.MONTHS);
        // fromTemp = fromTemp.plusMonths(months);

        long days = fromTemp.until(to, ChronoUnit.DAYS);

        return "";
    }

    @Override
    public void printMyData() {

    }
}
