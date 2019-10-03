package com.lambton.Employee;

import com.lambton.MISC.IPrintable;

import java.time.LocalDate;

//Created by Ramanpreet Singh
public abstract class EmployeeClass implements IPrintable {

    //Properties
    private String name;
    private int age;
    float EARNING = 1000.0f;

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
}
