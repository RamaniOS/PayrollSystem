/** Created by Nitin Jaswal*/
package com.lambton.Other;

import com.lambton.VehicleType.Car;

import java.time.LocalDate;

public class VehicleDisplayCommon {

    /** This is used to display car type*/
    public void printVehicleDisplay(String vehicleType, String manufacturer, String plateNo, String model, LocalDate insuranceDate, float milage, float price, int seater, String fuelType) {


        Car ca = new Car("car", "Tyota", "YDO123", "Classic", insuranceDate , 13.50f, 33000.00f, 4, "diesel");
        ca.printMyDisplay();
    }
}
