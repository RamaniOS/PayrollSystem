package com.lambton;

import com.lambton.VehicleType.Car;

import java.time.LocalDate;

public class NitinMain {
    public static void main(String[] args) {
        //Car.FuelType petrol = null;
        LocalDate insuranceDate = LocalDate.parse("2018-12-03");
        Car c = new Car("car", "Tyota", "PDO123", "Classic", insuranceDate , 13.50f, 33000.00f, 2, "petrol");
        c.printMyData();

        LocalDate insuranceDate1 = LocalDate.parse("2018-11-01");
        Car c1 = new Car("car", "Mercedies", "PDO123", "Sports", insuranceDate , 13.50f, 33000.00f, 2, "petrol");
        c1.printMyData();

        LocalDate insuranceDate2 = LocalDate.parse("2018-11-02");
        Car c2 = new Car("car", "Mercedies", "PDO123", "Sports", insuranceDate , 13.50f, 33000.00f, 2, "petrol");
        c2.printMyData();

        LocalDate insuranceDate3 = LocalDate.parse("2018-11-03");
        Car c3 = new Car("car", "Mercedies", "PDO123", "Sports", insuranceDate , 13.50f, 33000.00f, 2, "petrol");
        c3.printMyData();

        LocalDate insuranceDate4 = LocalDate.parse("2018-11-04");
        Car c4 = new Car("car", "Maruti", "PDO323", "Sports", insuranceDate , 13.50f, 33000.00f, 2, "petrol");
        c4.printMyData();

        LocalDate insuranceDate5 = LocalDate.parse("2018-11-05");
        Car c5 = new Car("car", "Maruti", "PDO323", "Sports", insuranceDate , 13.50f, 33000.00f, 2, "petrol");
        c5.printMyData();

        LocalDate insuranceDate6 = LocalDate.parse("2018-11-06");
        Car c6 = new Car("car", "Maruti", "PDO323", "Sports", insuranceDate , 13.50f, 33000.00f, 2, "petrol");
        c6.printMyData();

        LocalDate insuranceDate7 = LocalDate.parse("2018-11-07");
        Car c7 = new Car("car", "Maruti", "PDO323", "Sports", insuranceDate , 13.50f, 33000.00f, 2, "petrol");
        c7.printMyData();






        //   .
    }
}
