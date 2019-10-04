package com.lambton;

import com.lambton.Employee.EmployeeClass;
import com.lambton.EmployeeType.InternEmployee;
import com.lambton.MISC.IPrintable;
import com.lambton.PartTimeSalaryType.CommissionBasedPartTimeEmployee;
import com.lambton.PartTimeSalaryType.FixedBasedPartTimeEmployee;

//Created by Ramanpreet Singh
public class MainClass {

    // Main function
    public static void main(String[] args)
    {
        IPrintable[] p1 = new IPrintable[3];

        InternEmployee i = new InternEmployee("Matthew",  24, "Lambton College");
         p1[0] = i;

        EmployeeClass c = new CommissionBasedPartTimeEmployee("John", 22, 30.0f, 10, 20.0f);
        p1[1] = c;

        EmployeeClass f = new FixedBasedPartTimeEmployee("Cindy", 40, 30.0f, 10, 40.0f);
        p1[2] = f;

        for(int j=0;j<p1.length;j++) {
            p1[j].printMyData();
            System.out.println("----------------------------------------------------");
        }

        float total = (i.calculateEarning() + c.calculateEarning() + f.calculateEarning());
        System.out.println("TOTAL PAYROLL:" + " " + total + " " + "Canadian Dollars");
    }
}
