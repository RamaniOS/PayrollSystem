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
        FullTimeEmployee fE = new FullTimeEmployee("Niti", 26, 32000, 800);
        fE.vehicle = new Vehicle("car", "Tyota", "YDO123", "Classic", insuranceDate, 12.0f);
        fE.printMyData();
        System.out.println("*-------------------------------------------------------------------------*");

        InternEmployee i = new InternEmployee("Ramanpreet",  25, "Lambton College");
        i.printMyData();
        System.out.println("*-------------------------------------------------------------------------*");

        LocalDate insuranceDate1 = LocalDate.parse("2016-12-03");
        Car ca1 = new Car("car", "Sonata", "PER343", "Sports", insuranceDate1 , 23.50f, 39000.00f, 2, "petrol");
        EmployeeClass cp = new CommissionBasedPartTimeEmployee("Megan", 24, 30.0f, 10, 20.0f);
        cp.vehicle = new Vehicle("car", "Dodge", "Dollar01", "Charger", insuranceDate1, 15.0f);
        cp.printMyData();
        System.out.println("*-------------------------------------------------------------------------*");

        LocalDate insuranceDate2 = LocalDate.parse("2019-02-01");
        EmployeeClass fp = new FixedBasedPartTimeEmployee("John", 24, 30.0f, 10, 40.0f);
        fp.vehicle = new Vehicle("motorcycle", "Honda", "IOP23W", "Sports", insuranceDate1, 23.0f);
        fp.printMyData();
        System.out.println("*-------------------------------------------------------------------------*");

        float total = (i.calculateEarning() + cp.calculateEarning() + fp.calculateEarning() + fE.calculateEarning());
        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println("TOTAL PAYROLL:" + " " + formatter.format(total) + " " + "Canadian Dollars");
    }
}
