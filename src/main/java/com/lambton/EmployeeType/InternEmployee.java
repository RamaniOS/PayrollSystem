package com.lambton.EmployeeType;

import com.lambton.Employee.EmployeeClass;
import com.lambton.MISC.NameLengthException;

//Created by Ramanpreet Singh
public class InternEmployee extends EmployeeClass {

    private String schoolName;

    private String getSchoolName()
    {
        return schoolName;
    }

    private void setSchoolName(String schoolName)
    {
        this.schoolName = schoolName;
    }

    public InternEmployee()
    {
    }

    public InternEmployee(String name, int age, String schoolName)
    {
        super(name, age);
        this.schoolName = schoolName;
    }

    public float calculateEarning()
    {
        return 1000.0f;
    }

    @Override
    public void printMyData()
    {
        try {
            if (getName().length() < 5) throw new NameLengthException("Name must have more than 5 chars");
            else System.out.println("Name:" + " " + getName());
        } catch (NameLengthException e)  {
            System.out.println("Something happens wrong" + " " + e);
        }
        System.out.println("Year of Birth:" + " " + getBirthYear());

        // call method to get vehicle detail
        super.getVehicleDetails();

        System.out.println("Employee is Intern");
        System.out.println("    - SchoolName:" + " " + getSchoolName());
        System.out.println("    - Earnings:" + " $" + calculateEarning());
    }
}
