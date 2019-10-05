package com.lambton.EmployeeType;

import com.lambton.Employee.EmployeeClass;
import com.lambton.Other.IDispay;
import com.lambton.Other.VehicleDisplayCommon;

import java.time.LocalDate;

//Created by Ramanpreet Singh
public class FullTimeEmployee extends EmployeeClass {

    private float salary;
    private float bonus;

    private float getSalary()
    {
        return salary;
    }

    private void setSalary(float salary)
    {
        this.salary = salary;
    }

    private float getBonus()
    {
        return bonus;
    }

    private void setBonus(float bonus)
    {
        this.bonus = bonus;
    }

    public FullTimeEmployee(String name, int age, float salary, float bonus)
    {
        super(name, age);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public float calculateEarning()
    {
        return getSalary() + getBonus();
    }

    @Override
    public void printMyData() {

        System.out.println("Name:" + " " + getName());
        System.out.println("Year of Birth:" + " " + getBirthYear());

        VehicleDisplayCommon obj = new VehicleDisplayCommon();
        LocalDate insuranceDate = LocalDate.parse("2018-12-03");
        obj.printVehicleDisplay("car", "Tyota", "YDO123", "Classic", insuranceDate , 13.50f, 33000.00f, 4, "diesel");


        System.out.println("Employee is FullTime");
        System.out.println("    - Salary:" + " $" + this.salary);
        System.out.println("    - Bonus:" + " $" + this.bonus);
        System.out.println("    - Earning:" + " $" + this.calculateEarning());

    }
}
