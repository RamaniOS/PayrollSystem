/**
 * Created by: Nitin Jaswal
 */

package com.lambton.Vehicle;

import com.lambton.Other.IDispay;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.time.LocalDate;


/// This is the Vehicle class, containing the information of Employee's Vehicle.
public abstract class Vehicle implements IDispay {

    public enum VehicleType {
        car, motorcycle
    }

    /** Properties*/
    protected String manufacturer;
    protected String plateNo;
    protected String model;
    protected LocalDate insuranceDate;
    protected float milage;
    protected VehicleType vehicleType;

    /** Constructor*/
    public Vehicle(String manufacturer, String plateNo, String model, LocalDate insuranceDate, float milage, VehicleType vehicleType) {
        this.manufacturer = manufacturer;
        this.plateNo = plateNo;
        this.model = model;
        this.insuranceDate = insuranceDate;
        this.milage = milage;
        this.vehicleType = vehicleType;
    }

    /** Getter - Setter*/
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getInsuranceDate() {
        return insuranceDate;
    }

    public void setInsuranceDate(LocalDate insuranceDate) {
        this.insuranceDate = insuranceDate;
    }

    public float getMilage() {
        return milage;
    }

    public void setMilage(float milage) {
        this.milage = milage;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    /** Helper methods*/
    // this is the method to detect if vehicle gives good/low/average
    public String statusOfMilage(Float milage){
        // check the type of vehicle
        if(this.vehicleType.equals("car")){
            if(milage > 15.0 && milage < 25.0){
                return "Average Milage";
            }else if(milage < 15.0){
                return "Low Milage";
            }else{
                return "Good Milage";
            }
        }else{
            if(milage > 40.0 && milage < 60.0){
                return "Average Milage";
            }else if(milage < 40.0){
                return "Low Milage";
            }else{
                return "Good Milage";
            }
        }

    }

    // this is an undefined method to get the insurance status of the vehicle.
    public abstract String calculateInsuranceStatus();

    public abstract void printMyData();


}
