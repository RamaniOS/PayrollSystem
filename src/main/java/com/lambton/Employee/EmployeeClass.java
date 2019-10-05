package com.lambton.Employee;

import com.lambton.MISC.IPrintable;
import com.lambton.Vehicle.Vehicle;
import com.lambton.VehicleType.Car;
import com.lambton.VehicleType.MotorCycle;

import java.time.LocalDate;

//Created by Ramanpreet Singh
public abstract class EmployeeClass implements IPrintable {

    //Properties
    private String name;
    private int age;
    float EARNING = 1000.0f;

    public Car car;
    public MotorCycle motorcycle;

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



    public abstract void printMyData();

    public void getVehicleDetails() {

        if (car != null) {
            //
            if (car.getVehicleType().equalsIgnoreCase("car")) {
                // call method...
                car.printMyDisplay();
            }

        } else if(motorcycle != null){

            //
            if (motorcycle.getVehicleType().equalsIgnoreCase("motorcycle")) {

                // call method...
                motorcycle.printMyDisplay();
            }
        }else {

            System.out.println("Employee has no Vehicle registered");
        }
    }
}
