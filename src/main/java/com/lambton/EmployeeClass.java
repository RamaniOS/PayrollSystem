package com.lambton;

import java.time.LocalDate;

//Created by Ramanpreet Singh
public class EmployeeClass implements IPrintable {

    //Properties
    private String name;
    private int age;

    //Constructor
    public EmployeeClass() {
    }

    public EmployeeClass(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    //Getters & Setters
    private String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    //Custom functions
    private int calculateBirthYear()
    {
        return LocalDate.now().getYear() - getAge();
    }

    private Float calculateEarning()
    {
        return 1000.0f;
    }

    @Override
    public void printMyData()
    {
        System.out.println("Name:" + " " + getName());
        System.out.println("Year of Birth:" + " " + calculateBirthYear());
    }
}
