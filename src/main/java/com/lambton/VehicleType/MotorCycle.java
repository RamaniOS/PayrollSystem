/*
Created by: Nitin Jaswal
 */
package com.lambton.VehicleType;

import com.lambton.Vehicle.Vehicle;

public class MotorCycle extends Vehicle{
    public enum FuelType {
        petrol, diesel, gas
    }
    /** Properties*/
    protected VehicleType vehicleType;
    protected float price;
    protected int seater;
    protected FuelType fuelType;


}
