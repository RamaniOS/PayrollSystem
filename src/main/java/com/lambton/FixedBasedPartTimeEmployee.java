package com.lambton;

//Created by Ramanpreet Singh
public class FixedBasedPartTimeEmployee extends PartTimeEmployee implements IPrintable {

    private float fixedAmount;

    private float getFixedAmount()
    {
        return fixedAmount;
    }

    private void setFixedAmount(float fixedAmount)
    {
        this.fixedAmount = fixedAmount;
    }

    public FixedBasedPartTimeEmployee()
    {
    }

    public FixedBasedPartTimeEmployee(String name, int age, float rate, int hoursWorked, float fixedAmount)
    {
        super(name, age, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    @Override
    public float calculateEarning()
    {
        return (getRate() * getHoursWorked() + getFixedAmount());
    }

    @Override
    public void printMyData() {
        System.out.println("Name:" + " " + getName());
        System.out.println("Year of Birth:" + " " + getBirthYear());
        System.out.println("Rate:" + " " + getRate());
        System.out.println("HoursWorked:" + " " + getHoursWorked());
        System.out.println("Fixed Amount:" + " " + getFixedAmount());
        System.out.println("Earnings:" + " " + calculateEarning());
    }
}
