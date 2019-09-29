package com.lambton;

//Created by Ramanpreet Singh
public class FullTimeEmployee extends EmployeeClass {

    private float salary;
    private float bonus;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public FullTimeEmployee(float salary, float bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public FullTimeEmployee(String name, int age, float salary, float bonus) {
        super(name, age);
        this.salary = salary;
        this.bonus = bonus;
    }

    public float calculateEarnings()
    {
        return getSalary() + getBonus();
    }
}
