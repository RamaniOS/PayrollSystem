package com.lambton;

//Created by Ramanpreet Singh
public class PermanentEmployee extends EmployeeClass {

    private float salary;
    private float bonus;

    public float getSalary()
    {
        return salary;
    }

    private void setSalary(float salary)
    {
        this.salary = salary;
    }

    public float getBonus()
    {
        return bonus;
    }

    private void setBonus(float bonus)
    {
        this.bonus = bonus;
    }

    public PermanentEmployee()
    {
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

    @Override
    public void printMyData() {

    }
}
