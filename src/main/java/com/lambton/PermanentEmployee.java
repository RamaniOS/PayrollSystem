package com.lambton;

//Created by Ramanpreet Singh
public class PermanentEmployee extends EmployeeClass {

    float salary;
    float bonus;

    public float getSalary()
    {
        return salary;
    }

    public void setSalary(float salary)
    {
        this.salary = salary;
    }

    public float getBonus()
    {
        return bonus;
    }

    public void setBonus(float bonus)
    {
        this.bonus = bonus;
    }

    public PermanentEmployee(float salary, float bonus)
    {
        this.salary = salary;
        this.bonus = bonus;
    }

    public PermanentEmployee(String name, int age, float salary, float bonus)
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
}
