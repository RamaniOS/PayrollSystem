package com.lambton.PartTimeSalaryType;

import com.lambton.EmployeeType.PartTimeEmployee;

//Created by Ramanpreet Singh
public class CommissionBasedPartTimeEmployee extends PartTimeEmployee {

    private float CommissionPercentage;

    public CommissionBasedPartTimeEmployee()
    {
    }

    public CommissionBasedPartTimeEmployee(String name, int age, float rate, int hoursWorked, float CommissionPercentage)
    {
        super(name, age, rate, hoursWorked);
        this.CommissionPercentage = CommissionPercentage;
    }

    private float getCommissionPercentage()
    {
        return CommissionPercentage;
    }

    private void setCommission(float CommissionPercentage)
    {
        CommissionPercentage = CommissionPercentage;
    }

    private float calculateHours()
    {
        return getRate() * getHoursWorked();
    }

    private float calculateCommission()
    {
        float calculateHours = calculateHours();
        return (calculateHours + ((calculateHours * getCommissionPercentage()) / 100));
    }

    @Override
    public float calculateEarning()
    {
        return calculateCommission();
    }

    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("Employee is PartTime / Commissioned");
        System.out.println("    - Rate:" + " $" + getRate());
        System.out.println("    - HoursWorked:" + " " + getHoursWorked());
        System.out.println("    - Commission:" + " " + getCommissionPercentage()+"%");
        System.out.println("    - Earnings:" + " $" + calculateEarning());
    }
}