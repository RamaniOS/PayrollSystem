package com.lambton.Employee;

import com.lambton.MISC.IPrintable;
import com.lambton.Vehicle.Vehicle;
import com.lambton.VehicleType.Car;

import java.time.LocalDate;

//Created by Ramanpreet Singh
public abstract class EmployeeClass implements IPrintable {

    //Properties
    private String name;
    private int age;
    float EARNING = 1000.0f;
    public Vehicle vehicle;

    //Constructor
    public EmployeeClass() {
    }

    public EmployeeClass(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    //Getters & Setters
    public String getName()
    {
        return name;
    }

    private void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    private void setAge(int age)
    {
        this.age = age;
    }

    //Custom functions
    public int getBirthYear()
    {
        return calculateBirthYear();
    }

    private int calculateBirthYear()
    {
        return LocalDate.now().getYear() - getAge();
    }

    public abstract float calculateEarning();

    public abstract void printMyData();

    public void getVehicleDetails() {
        if (vehicle != null) {
            if (vehicle.getVehicleType().equalsIgnoreCase("car")) {
                System.out.println("Employee has a Car");
            } else if (vehicle.getVehicleType().equalsIgnoreCase("Motorcycle")) {
                System.out.println("Employee has a Motorcycle");
            }
            System.out.println("Make:" + " " + vehicle.getManufacturer());
            System.out.println("Plate:" + " " + vehicle.getPlateNo());
            System.out.println("Model:" + " " + vehicle.getModel());
            System.out.println("InsuranceDate:" + " " + vehicle.getInsuranceDate());
            System.out.println("Milage:" + " " + vehicle.getMilage());
        } else {
            System.out.println("Employee has no Vehicle registered");
        }
    }
}
