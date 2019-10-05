package com.lambton.EmployeeType;

import com.lambton.Employee.EmployeeClass;
import com.lambton.MISC.NameLengthException;

//Created by Ramanpreet Singh
public abstract class PartTimeEmployee extends EmployeeClass {

    private float rate;
    private int hoursWorked;

    public PartTimeEmployee()
    {
    }

    public float getRate()
    {
        return rate;
    }

    private void setRate(float rate)
    {
        this.rate = rate;
    }

    public int getHoursWorked()
    {
        return hoursWorked;
    }

    private void setHoursWorked(int hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }

    public PartTimeEmployee(String name, int age, float rate, int hoursWorked)
    {
        super(name, age);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public abstract float calculateEarning();

    @Override
    public void printMyData() {
        try {
            if (getName().length() < 5) throw new NameLengthException("Name must have more than 5 chars");
            else System.out.println("Name:" + " " + getName());
        } catch (NameLengthException e)  {
            System.out.println("Something happens wrong" + " " + e);
        }
        System.out.println("Year of Birth:" + " " + getBirthYear());
    }
}
