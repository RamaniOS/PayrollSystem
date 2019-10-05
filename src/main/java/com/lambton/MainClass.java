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
import org.json.JSONArray;
import org.json.JSONObject;

import java.time.LocalDate;

public class MainClass {

    /** Main function*/
    public static void main(String[] args)
    {


        JSONObject exjObj = new JSONObject(getJsonString());
        JSONArray arr =  exjObj.getJSONArray("JSON");
        for (int i = 0; i < arr.length(); i++){
            System.out.println("Nitin" + arr.get(i));
        }

        System.out.println("*-------------------------------------------------------------------------*");

        LocalDate insuranceDate = LocalDate.parse("2018-12-03");
        System.out.println("-------------------------------------------------------------------------");

        FullTimeEmployee fE = new FullTimeEmployee("Nitin", 26, 32000, 800);
        fE.vehicle = new Vehicle("car", "Tyota", "YDO123", "Classic", insuranceDate, 12.0f);

        fE.printMyData();



        FullTimeEmployee fE1 = new FullTimeEmployee("wsee", 26, 32000, 800);
        fE1.vehicle = new Vehicle("Motorcycle", "dsad", "YDO123", "Classic", insuranceDate, 12.0f);

        fE1.printMyData();


        System.out.println("*-------------------------------------------------------------------------*");
        InternEmployee i = new InternEmployee("Ramanpreet",  25, "Lambton College");
        i.printMyData();
        LocalDate insuranceDate1 = LocalDate.parse("2016-12-03");
        Car ca1 = new Car("car", "Sonata", "PER343", "Sports", insuranceDate1 , 23.50f, 39000.00f, 2, "petrol");


        System.out.println("*-------------------------------------------------------------------------*");
        EmployeeClass cP = new CommissionBasedPartTimeEmployee("Megan", 24, 30.0f, 10, 20.0f);
        cP.printMyData();

        LocalDate insuranceDate2 = LocalDate.parse("2019-02-01");
        MotorCycle mC = new MotorCycle("motorcycle", "Honda", "IOP23W", "Sports", insuranceDate1, 23.0f, 26000.00f, 1, "petrol");
        //mC.printMyData();


        System.out.println("*-------------------------------------------------------------------------*");
        EmployeeClass fP = new FixedBasedPartTimeEmployee("John", 24, 30.0f, 10, 40.0f);
        fP.printMyData();

        LocalDate insuranceDate3 = LocalDate.parse("2018-10-01");
        MotorCycle mC1 = new MotorCycle("N/A", "Honda", "IOP23W", "Sports", insuranceDate1, 23.0f, 26000.00f, 1, "petrol");
        //mC1.printMyData();

        System.out.println("-------------------------------------------------------------------------");


        System.out.println("*-------------------------------------------------------------------------*");
        float total = (i.calculateEarning() + cP.calculateEarning() + fP.calculateEarning() + fE.calculateEarning());
        System.out.println("TOTAL PAYROLL:" + " " + total + " " + "Canadian Dollars");
    }

    public static String getJsonString(){
        String str = "\"  \\\"JSON\\\":[{\n" +
                "  \"id\": 1,\n" +
                "  \"name\": \"Ramanpreet Singh\",\n" +
                "  \"age\": 23,\n" +
                "  \"schoolName\": \"Lambton College\",\n" +
                "  \"type\": \"Intern\",\n" +
                "  \"vehicle\": \"N/A\"\n" +
                "},\n" +
                "  {\n" +
                "    \"id\": 2,\n" +
                "    \"name\": \"Nitin Jaswal\",\n" +
                "    \"age\": 25,\n" +
                "    \"rate\": 30.0,\n" +
                "    \"hoursWorked\": 10,\n" +
                "    \"fixedAmount\": 40.0,\n" +
                "    \"type\": \"PartTime / Fixed Amount\",\n" +
                "    \"vehicle\": {\n" +
                "      \"id\": 1,\n" +
                "      \"vehicleType\": \"car\",\n" +
                "      \"manufacturer\": \"Tata Motors\",\n" +
                "      \"plateNo\": \"PB777\",\n" +
                "      \"model\": \"Jaguar Land Rover\",\n" +
                "      \"insuranceDate\": \"2016-05-03\",\n" +
                "      \"mileage\": 2.8,\n" +
                "      \"details\": {\n" +
                "        \"price\": 15650.20,\n" +
                "        \"fuelType\": \"Diesel\",\n" +
                "        \"noOfSeats\": 3\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 3,\n" +
                "    \"name\": \"Kiranjeet Kaur\",\n" +
                "    \"age\": 22,\n" +
                "    \"rate\": 30.0,\n" +
                "    \"hoursWorked\": 10,\n" +
                "    \"commissionPercentage\": 20,\n" +
                "    \"type\": \"PartTime / Commissioned\",\n" +
                "    \"vehicle\": {\n" +
                "      \"id\": 1,\n" +
                "      \"manufacturer\": \"Royal Enfield\",\n" +
                "      \"plateNo\": \"MH455\",\n" +
                "      \"model\": \"Classic 350\",\n" +
                "      \"insuranceDate\": \"2018-11-20\",\n" +
                "      \"mileage\": 11.2,\n" +
                "      \"vehicleType\": \"motorcycle\",\n" +
                "      \"details\": {\n" +
                "        \"price\": 2100.30,\n" +
                "        \"fuelType\": \"Petrol\",\n" +
                "        \"noOfSeats\": 1\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 4,\n" +
                "    \"name\": \"John\",\n" +
                "    \"age\": 26,\n" +
                "    \"salary\": 30.0,\n" +
                "    \"bonus\": 10,\n" +
                "    \"vehicle\": {\n" +
                "      \"id\": 1,\n" +
                "      \"vehicleType\": \"car\",\n" +
                "      \"manufacturer\": \"Majda\",\n" +
                "      \"plateNo\": \"UP777\",\n" +
                "      \"model\": \"Sports\",\n" +
                "      \"insuranceDate\": \"2018-12-03\",\n" +
                "      \"mileage\": 12.8,\n" +
                "      \"details\": {\n" +
                "        \"price\": 25550.20,\n" +
                "        \"fuelType\": \"Diesel\",\n" +
                "        \"noOfSeats\": 7\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "]";

        return str;
    }
}
