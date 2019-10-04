package com.lambton;

import com.lambton.VehicleType.Car;
import com.lambton.VehicleType.MotorCycle;

import java.time.LocalDate;

public class NitinMain {
    public static void main(String[] args) {
        //Car.FuelType petrol = null;
        LocalDate insuranceDate = LocalDate.parse("2018-12-03");
        Car c = new Car("car", "Tyota", "PDO123", "Classic", insuranceDate , 13.50f, 33000.00f, 2, "petrol");
        c.printMyData();

        LocalDate insuranceDate1 = LocalDate.parse("2018-12-01");
        MotorCycle mC = new MotorCycle("motorcycle", "Honda", "IOP23W", "Sports", insuranceDate1, 23.0f, 26000.00f, 1, "petrol");
        mC.printMyData();










        //   .
    }
}
