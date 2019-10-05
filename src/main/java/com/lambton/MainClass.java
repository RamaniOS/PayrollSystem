/** Created by Nitin Jaswal and Ramanpreet Singh */

package com.lambton;

import com.lambton.Employee.EmployeeClass;
import com.lambton.EmployeeType.FullTimeEmployee;
import com.lambton.EmployeeType.InternEmployee;
import com.lambton.MISC.IPrintable;
import com.lambton.PartTimeSalaryType.CommissionBasedPartTimeEmployee;
import com.lambton.PartTimeSalaryType.FixedBasedPartTimeEmployee;
import com.lambton.VehicleType.Car;
import com.lambton.VehicleType.MotorCycle;

import java.time.LocalDate;


public class MainClass {


    /** Main function*/
    public static void main(String[] args)
    {

        System.out.println("-------------------------------------------------------------------------");
        FullTimeEmployee fE = new FullTimeEmployee("Nitin", 26, 32000, 800);
        fE.printMyData();
        LocalDate insuranceDate = LocalDate.parse("2018-12-03");
        Car ca = new Car("car", "Tyota", "YDO123", "Classic", insuranceDate , 13.50f, 33000.00f, 4, "diesel");
        ca.printMyData();

        System.out.println("-------------------------------------------------------------------------");
        InternEmployee i = new InternEmployee("Ramanpreet",  25, "Lambton College");
        i.printMyData();
        LocalDate insuranceDate1 = LocalDate.parse("2016-12-03");
        Car ca1 = new Car("car", "Sonata", "PER343", "Sports", insuranceDate1 , 23.50f, 39000.00f, 2, "petrol");
        ca1.printMyData();

        System.out.println("-------------------------------------------------------------------------");
        EmployeeClass cP = new CommissionBasedPartTimeEmployee("Kiranjeet", 24, 30.0f, 10, 20.0f);
        cP.printMyData();
        LocalDate insuranceDate2 = LocalDate.parse("2019-02-01");
        MotorCycle mC = new MotorCycle("motorcycle", "Honda", "IOP23W", "Sports", insuranceDate1, 23.0f, 26000.00f, 1, "petrol");
        mC.printMyData();

        System.out.println("-------------------------------------------------------------------------");
        EmployeeClass fP = new FixedBasedPartTimeEmployee("John", 24, 30.0f, 10, 40.0f);
        fP.printMyData();
        LocalDate insuranceDate3 = LocalDate.parse("2018-10-01");
        MotorCycle mC1 = new MotorCycle("N/A", "Honda", "IOP23W", "Sports", insuranceDate1, 23.0f, 26000.00f, 1, "petrol");
        mC1.printMyData();

        System.out.println("-------------------------------------------------------------------------");

        float total = (i.calculateEarning() + cP.calculateEarning() + fP.calculateEarning() + fE.calculateEarning());
        System.out.println("TOTAL PAYROLL:" + " " + total + " " + "Canadian Dollars");
    }
}
