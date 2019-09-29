package com.lambton;

//Created by Ramanpreet Singh
public class InternEmployee extends EmployeeClass {

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public InternEmployee(String schoolName) {
        this.schoolName = schoolName;
    }

    public InternEmployee(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }
}
