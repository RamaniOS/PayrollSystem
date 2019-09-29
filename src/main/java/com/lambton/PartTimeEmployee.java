package com.lambton;

//Created by Ramanpreet Singh
public class PartTimeEmployee extends EmployeeClass {

    private float rate;
    private int hoursWorked;

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public PartTimeEmployee(float rate, int hoursWorked) {
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public PartTimeEmployee(String name, int age, float rate, int hoursWorked) {
        super(name, age);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }
}
