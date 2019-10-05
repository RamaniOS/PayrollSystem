/** Created by Nitin Jaswal and Ramanpreet Singh */

package com.lambton;

import com.lambton.Employee.EmployeeClass;
import com.lambton.EmployeeType.FullTimeEmployee;
import com.lambton.EmployeeType.InternEmployee;
import com.lambton.PartTimeSalaryType.CommissionBasedPartTimeEmployee;
import com.lambton.PartTimeSalaryType.FixedBasedPartTimeEmployee;
import com.lambton.Vehicle.Vehicle;
import com.lambton.VehicleType.Car;
import com.lambton.VehicleType.MotorCycle;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class MainClass {

    /** Main function*/
    public static void main(String[] args)
    {
        System.out.println("*-------------------------------------------------------------------------*");
        LocalDate insuranceDate = LocalDate.parse("2018-12-03");
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Nitin", 26, 32000, 800);
        fullTimeEmployee.vehicle = new Vehicle("car", "Tyota", "YDO123", "Classic", insuranceDate, 12.0f);
        fullTimeEmployee.printMyData();
        System.out.println("*-------------------------------------------------------------------------*");

        InternEmployee internEmployee = new InternEmployee("Ramanpreet",  25, "Lambton College");
        internEmployee.printMyData();
        System.out.println("*-------------------------------------------------------------------------*");

        LocalDate insuranceDate1 = LocalDate.parse("2016-12-03");
        EmployeeClass commissionBasedPartTimeEmployee = new CommissionBasedPartTimeEmployee("Megan", 24, 30.0f, 10, 20.0f);
        commissionBasedPartTimeEmployee.vehicle = new Vehicle("car", "Dodge", "Dollar01", "Charger", insuranceDate1, 15.0f);
        commissionBasedPartTimeEmployee.printMyData();
        System.out.println("*-------------------------------------------------------------------------*");

        LocalDate insuranceDate2 = LocalDate.parse("2019-02-01");
        EmployeeClass fixedBasedPartTimeEmployee = new FixedBasedPartTimeEmployee("John", 24, 30.0f, 10, 40.0f);
        fixedBasedPartTimeEmployee.vehicle = new Vehicle("motorcycle", "Honda", "IOP23W", "Sports", insuranceDate1, 23.0f);
        fixedBasedPartTimeEmployee.printMyData();
        System.out.println("*-------------------------------------------------------------------------*");

        float total = (fixedBasedPartTimeEmployee.calculateEarning() + fullTimeEmployee.calculateEarning() + internEmployee.calculateEarning() + commissionBasedPartTimeEmployee.calculateEarning());
        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println("TOTAL PAYROLL:" + " " + formatter.format(total) + " " + "Canadian Dollars");
    }
}
