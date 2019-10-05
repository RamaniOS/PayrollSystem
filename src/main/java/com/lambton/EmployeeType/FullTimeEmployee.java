package com.lambton.EmployeeType;

import com.lambton.Employee.EmployeeClass;
import com.lambton.MISC.NameLengthException;

//Created by Ramanpreet Singh
public class FullTimeEmployee extends EmployeeClass {

    private float salary;
    private float bonus;

    private float getSalary()
    {
        return salary;
    }

    private void setSalary(float salary)
    {
        this.salary = salary;
    }

    private float getBonus()
    {
        return bonus;
    }

    private void setBonus(float bonus)
    {
        this.bonus = bonus;
    }

    public FullTimeEmployee(String name, int age, float salary, float bonus)
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
        try {
            if (getName().length() < 5) throw new NameLengthException("Name must have more than 5 chars");
            else System.out.println("Name:" + " " + getName());
        } catch (NameLengthException e)  {
            System.out.println("Something happens wrong" + " " + e);
        }
        System.out.println("Year of Birth:" + " " + getBirthYear());

        // call method to get vehicle detail
        super.getVehicleDetails();

        System.out.println("Employee is FullTime");
        System.out.println("    - Salary:" + " $" + this.salary);
        System.out.println("    - Bonus:" + " $" + this.bonus);
        System.out.println("    - Earning:" + " $" + this.calculateEarning());

    }
}