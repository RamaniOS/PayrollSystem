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

        LocalDate insuranceDate2 = LocalDate.parse("2018-12-02");
        MotorCycle mC2 = new MotorCycle("motorcycle", "Honda", "IOP23W", "Sports", insuranceDate2, 23.0f, 26000.00f, 1, "petrol");
        mC2.printMyData();

        LocalDate insuranceDate3 = LocalDate.parse("2018-12-03");
        MotorCycle mC3 = new MotorCycle("motorcycle", "Honda", "IOP23W", "Sports", insuranceDate3, 23.0f, 26000.00f, 1, "petrol");
        mC3.printMyData();

        LocalDate insuranceDate4 = LocalDate.parse("2018-12-04");
        MotorCycle mC4 = new MotorCycle("motorcycle", "Honda", "IOP23W", "Sports", insuranceDate4, 23.0f, 26000.00f, 1, "petrol");
        mC4.printMyData(); //

        LocalDate insuranceDate5 = LocalDate.parse("2018-12-14");
        MotorCycle mC5 = new MotorCycle("motorcycle", "Honda", "IOP23W", "Sports", insuranceDate5, 23.0f, 16000.00f, 1, "petrol");
        mC5.printMyData();

        LocalDate insuranceDate6 = LocalDate.parse("2018-12-15");
        MotorCycle mC6 = new MotorCycle("motorcycle", "Hondai", "IOP23W0", "Sports", insuranceDate6, 23.0f, 66000.00f, 1, "petrol");
        mC6.printMyData();

        LocalDate insuranceDate7 = LocalDate.parse("2018-12-16");
        MotorCycle mC7 = new MotorCycle("motorcycle", "Hondai", "IOP23W0", "Sports", insuranceDate7, 23.0f, 66000.00f, 1, "petrol");
        mC7.printMyData();

        LocalDate insuranceDate8 = LocalDate.parse("2018-12-17");
        MotorCycle mC8 = new MotorCycle("motorcycle", "Hondai", "IYP23W0", "Sports", insuranceDate7, 23.0f, 66000.00f, 1, "petrol");
        mC8.printMyData();

        LocalDate insuranceDate9 = LocalDate.parse("2018-12-18");
        MotorCycle mC9 = new MotorCycle("motorcycle", "Hondai", "IYP23W0", "Sports", insuranceDate7, 23.0f, 66000.00f, 1, "petrol");
        mC9.printMyData();

        LocalDate insuranceDate10 = LocalDate.parse("2018-12-19");
        MotorCycle mC10 = new MotorCycle("motorcycle", "Hondai", "IYP23W0", "Sports", insuranceDate7, 23.0f, 66000.00f, 1, "petrol");
        mC10.printMyData();










        //   .
    }
}
