/*
Created by: Nitin Jaswal
 */
package com.lambton.VehicleType;

import com.lambton.Other.CalculateInsuranceStat;
import com.lambton.Vehicle.Vehicle;

import java.time.LocalDate;

/// This is the Car class inherited from parent class 'Vehicle', containing the information of vehicle type car.
public class Car extends Vehicle {

    //-----------------------------------------------------------------------
//    public enum FuelType {
//        petrol, diesel, gas, Tesla
//    }
    /** Properties*/
    protected float price;
    protected int seater;
    protected String fuelType;

    //-----------------------------------------------------------------------
    /** Constructor*/
    public Car(String vehicleType, String manufacturer, String plateNo, String model, LocalDate insuranceDate, float milage, float price, int seater, String fuelType) {
        super(vehicleType, manufacturer, plateNo, model, insuranceDate, milage);
        this.price = price;
        this.seater = seater;
        this.fuelType = fuelType;
    }

    //-----------------------------------------------------------------------
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

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    //-----------------------------------------------------------------------
    /** Helper Method*/
    @Override
    public String calculateInsuranceStatus() {

        // get the insurance date from Vehicle class getter method.
        LocalDate insurDate = getInsuranceDate();

        // use common public method to calculate the insurace status.
        CalculateInsuranceStat obj = new CalculateInsuranceStat();
        // call method.
        String strRemainingDuration = obj.calculateInsuranceStatusOfVehicle(insurDate);

        return strRemainingDuration;
    }

    @Override
    public void printMyData() {

        System.out.println("//-----------------------------------------------------------------------");
        System.out.println("Vehicle Type:" + " " + getVehicleType());//
        System.out.println("Manufacturer:" + " " + getManufacturer());//
        System.out.println("Plate No.:" + " " + getPlateNo());//
        System.out.println("Model:" + " " + getModel());//
        System.out.println("Insurance Date:" + " " + getInsuranceDate());//
        System.out.println("Insurance Status:" + " " + calculateInsuranceStatus());
        float milage = getMilage();
        System.out.println("Milage:" + " " + milage);//
        System.out.println("Milage Status:" + " " + super.statusOfMilage(milage));
        System.out.println("//-----------------------------------------------------------------------");

    }
}
