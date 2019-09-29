package com.lambton;

//Created by Ramanpreet Singh
public class CommissionBasedPartTimeEmployee extends PartTimeEmployee {

    private float CommissionPercentage;

    public CommissionBasedPartTimeEmployee(float rate, int hoursWorked) {
        super(rate, hoursWorked);
    }

    public CommissionBasedPartTimeEmployee(String name, int age, float rate, int hoursWorked) {
        super(name, age, rate, hoursWorked);
    }

    public float getCommission() {
        return CommissionPercentage;
    }

    public void setCommission(float CommissionPercentage) {
        CommissionPercentage = CommissionPercentage;
    }

    public float calculateEarnings()
    {
        return (getRate() * getHoursWorked()) + getCommission();
    }
}

