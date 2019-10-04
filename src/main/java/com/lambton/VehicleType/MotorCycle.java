/*
Created by: Nitin Jaswal
 */
package com.lambton.VehicleType;

import com.lambton.Vehicle.Vehicle;

import java.time.LocalDate;

public class MotorCycle extends Vehicle{
    public enum FuelType {
        petrol, diesel, gas
    }

    /** Properties*/
    protected VehicleType vehicleType;
    protected float price;
    protected int seater;
    protected FuelType fuelType;

    /** Getter - Setter*/
    @Override
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

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

    /** Constructor*/
    public MotorCycle(String manufacturer, String plateNo, String model, LocalDate insuranceDate, float milage, VehicleType vehicleType, VehicleType vehicleType1, float price, int seater, FuelType fuelType) {
        super(manufacturer, plateNo, model, insuranceDate, milage, vehicleType);
        this.vehicleType = vehicleType1;
        this.price = price;
        this.seater = seater;
        this.fuelType = fuelType;
    }

    /** Helper */
    @Override
    public String calculateInsuranceStatus() {
        return "";
    }

    @Override
    public void printMyData() {

    }


}
