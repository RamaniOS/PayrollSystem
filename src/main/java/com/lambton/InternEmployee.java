package com.lambton;

//Created by Ramanpreet Singh
public class InternEmployee extends EmployeeClass implements IPrintable {

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

    @Override
    public float calculateEarning()
    {
        return TOTAL_EARNING;
    }

    @Override
    public void printMyData()
    {
        System.out.println("Name:" + " " + getName());
        System.out.println("Year of Birth:" + " " + getBirthYear());
        System.out.println("SchoolName:" + " " + getSchoolName());
        System.out.println("Earnings:" + " " + calculateEarning());
    }
}
