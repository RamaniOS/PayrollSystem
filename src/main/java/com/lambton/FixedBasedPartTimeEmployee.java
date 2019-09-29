package com.lambton;

//Created by Ramanpreet Singh
public class FixedBasedPartTimeEmployee extends PartTimeEmployee {

    float fixedAmount;

    public float getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(float fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public FixedBasedPartTimeEmployee(float rate, int hoursWorked) {
        super(rate, hoursWorked);
    }

    public FixedBasedPartTimeEmployee(String name, int age, float rate, int hoursWorked) {
        super(name, age, rate, hoursWorked);
    }

    public float calculateEarnings()
    {
        return (getRate() * getHoursWorked() + getFixedAmount());
    }
}
