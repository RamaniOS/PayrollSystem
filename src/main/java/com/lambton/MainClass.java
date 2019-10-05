/** Created by Nitin Jaswal and Ramanpreet Singh */

package com.lambton;

import com.lambton.Employee.EmployeeClass;
import com.lambton.EmployeeType.FullTimeEmployee;
import com.lambton.EmployeeType.InternEmployee;
import com.lambton.MISC.Logger;
import com.lambton.PartTimeSalaryType.CommissionBasedPartTimeEmployee;
import com.lambton.PartTimeSalaryType.FixedBasedPartTimeEmployee;
import com.lambton.VehicleType.Car;
import com.lambton.VehicleType.MotorCycle;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;

public class MainClass {

    /** Main function*/
    public static void main(String[] args) {
        System.out.println("\n*** PAYROLL SYSTEM ***");
            // get JSON String:
            JSONObject exjObj = new JSONObject(getJsonString());

            float totalPayroll = 0.0f;

            JSONArray arr =  exjObj.getJSONArray("JSON");
            for (int i = 0; i < arr.length(); i++){

                JSONObject obj = arr.getJSONObject(i);

            String employeeType = obj.getString("type");

            if(employeeType.equals("FullTime")){

                // 1.
                System.out.println("*-------------------------------------------------------------------------*");

                // https://www.w3resource.com/java-tutorial/inheritance-composition-relationship.php
                FullTimeEmployee fE = new FullTimeEmployee(obj.getString("name"), obj.getInt("age"), obj.getFloat("salary"), obj.getInt("bonus"));

                if (!obj.isNull("vehicle")) {
                    JSONObject objV = obj.getJSONObject("vehicle");
                    LocalDate insuranceDate = LocalDate.parse(objV.getString("insuranceDate"));

                    JSONObject objVDetal = objV.getJSONObject("details");

                    // can apply check on objV.getString("vehicleType")
                    fE.car = new Car(objV.getString("vehicleType"), objV.getString("manufacturer"), objV.getString("plateNo"), objV.getString("model"), insuranceDate, objV.getFloat("mileage"),  objVDetal.getFloat("price"), objVDetal.getInt("noOfSeats"), objVDetal.getString("fuelType"));

                }

                fE.printMyData();
                totalPayroll = totalPayroll + fE.calculateEarning();

            }else if(employeeType.equals("Intern")){
                // 2.
                System.out.println("*-------------------------------------------------------------------------*");
//
                InternEmployee iE = new InternEmployee(obj.getString("name"),  obj.getInt("age"), obj.getString("schoolName"));

                if (!obj.isNull("vehicle")) {
                    JSONObject objV = obj.getJSONObject("vehicle");
                    LocalDate insuranceDate = LocalDate.parse(objV.getString("insuranceDate"));

                    JSONObject objVDetal = objV.getJSONObject("details");

                    // can apply check on objV.getString("vehicleType")
                    iE.car = new Car(objV.getString("vehicleType"), objV.getString("manufacturer"), objV.getString("plateNo"), objV.getString("model"), insuranceDate, objV.getFloat("mileage"),  objVDetal.getFloat("price"), objVDetal.getInt("noOfSeats"), objVDetal.getString("fuelType"));
                }
                 iE.printMyData();

                totalPayroll = totalPayroll + iE.calculateEarning();

            }else if(employeeType.equals("PartTime / Commissioned")){
                // 3.
                System.out.println("*-------------------------------------------------------------------------*");

                CommissionBasedPartTimeEmployee cP = new CommissionBasedPartTimeEmployee(obj.getString("name"),  obj.getInt("age"), obj.getFloat("rate"), obj.getInt("hoursWorked"), obj.getFloat("commissionPercentage"));

                if (!obj.isNull("vehicle")) {
                    JSONObject objV = obj.getJSONObject("vehicle");
                    LocalDate insuranceDate = LocalDate.parse(objV.getString("insuranceDate"));

                    JSONObject objVDetal = objV.getJSONObject("details");

                    // can apply check on objV.getString("vehicleType")
                    cP.motorcycle = new MotorCycle(objV.getString("vehicleType"), objV.getString("manufacturer"), objV.getString("plateNo"), objV.getString("model"), insuranceDate, objV.getFloat("mileage"),  objVDetal.getFloat("price"), objVDetal.getInt("noOfSeats"), objVDetal.getString("fuelType"));

                }

                cP.printMyData();

                totalPayroll = totalPayroll + cP.calculateEarning();

            }else if(employeeType.equals("PartTime / Fixed Amount")){
                // 4.
                System.out.println("*-------------------------------------------------------------------------*");

                FixedBasedPartTimeEmployee fP = new FixedBasedPartTimeEmployee(obj.getString("name"),  obj.getInt("age"), obj.getFloat("rate"), obj.getInt("hoursWorked"), obj.getFloat("fixedAmount"));

                if (!obj.isNull("vehicle")) {
                    JSONObject objV = obj.getJSONObject("vehicle");
                    LocalDate insuranceDate = LocalDate.parse(objV.getString("insuranceDate"));

                    JSONObject objVDetal = objV.getJSONObject("details");

                    // can apply check on objV.getString("vehicleType")
                    fP.motorcycle = new MotorCycle(objV.getString("vehicleType"), objV.getString("manufacturer"), objV.getString("plateNo"), objV.getString("model"), insuranceDate, objV.getFloat("mileage"),  objVDetal.getFloat("price"), objVDetal.getInt("noOfSeats"), objVDetal.getString("fuelType"));

                }

                fP.printMyData();

                totalPayroll = totalPayroll + fP.calculateEarning();
            }

        }

        System.out.println("*-------------------------------------------------------------------------*");

        NumberFormat formatter = new DecimalFormat("###,###,###.##");
        String total = "TOTAL PAYROLL:" + " " + formatter.format(totalPayroll) + " " + "Canadian Dollars";
        System.out.println(total);
        // Write output into text file
        try {
            Logger.log(total);
        } catch (IOException e) {
            System.out.println("Something happened wrong" + e);
        }
    }


    public static String getJsonString(){
        String str = "{\n" +
                "  \"JSON\":[{\n" +
                "  \"id\": 1,\n" +
                "  \"name\": \"Ramanpreet Singh\",\n" +
                "  \"age\": 25,\n" +
                "  \"schoolName\": \"Lambton College\",\n" +
                "  \"type\": \"Intern\",\n" +
                "  \"vehicle\": null\n" +
                "  \n" +
                "},\n" +
                "  {\n" +
                "    \"id\": 2,\n" +
                "    \"name\": \"Sameer Kumar\",\n" +
                "    \"age\": 26,\n" +
                "    \"rate\": 30.0,\n" +
                "    \"hoursWorked\": 10,\n" +
                "    \"fixedAmount\": 40.0,\n" +
                "    \"type\": \"PartTime / Fixed Amount\",\n" +
                "    \"vehicle\": {\n" +
                "      \"id\": 2,\n" +
                "      \"vehicleType\": \"motorcycle\",\n" +
                "      \"manufacturer\": \"Bajaj\",\n" +
                "      \"plateNo\": \"PB777\",\n" +
                "      \"model\": \"Pulser220\",\n" +
                "      \"insuranceDate\": \"2018-12-03\",\n" +
                "      \"mileage\": 32.8,\n" +
                "      \"details\": {\n" +
                "        \"price\": 15650.20,\n" +
                "        \"fuelType\": \"Petrol\",\n" +
                "        \"noOfSeats\": 2\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 3,\n" +
                "    \"name\": \"Nitin Jaswal\",\n" +
                "    \"age\": 22,\n" +
                "    \"rate\": 30.0,\n" +
                "    \"hoursWorked\": 10,\n" +
                "    \"commissionPercentage\": 20,\n" +
                "    \"type\": \"PartTime / Commissioned\",\n" +
                "    \"vehicle\": {\n" +
                "      \"id\": 3,\n" +
                "      \"manufacturer\": \"Royal Enfield\",\n" +
                "      \"plateNo\": \"MH455\",\n" +
                "      \"model\": \"Classic 350\",\n" +
                "      \"insuranceDate\": \"2016-12-03\",\n" +
                "      \"mileage\": 21.2,\n" +
                "      \"vehicleType\": \"motorcycle\",\n" +
                "      \"details\": {\n" +
                "        \"price\": 21000.30,\n" +
                "        \"fuelType\": \"Petrol\",\n" +
                "        \"noOfSeats\": 1\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 4,\n" +
                "    \"name\": \"John Bond\",\n" +
                "    \"age\": 26,\n" +
                "    \"salary\": 30.0,\n" +
                "    \"bonus\": 10,\n" +
                "    \"type\": \"FullTime\",\n" +
                "    \"vehicle\": {\n" +
                "      \"id\": 4,\n" +
                "      \"vehicleType\": \"car\",\n" +
                "      \"manufacturer\": \"Mazda\",\n" +
                "      \"plateNo\": \"UP777\",\n" +
                "      \"model\": \"Sports\",\n" +
                "      \"insuranceDate\": \"2019-02-01\",\n" +
                "      \"mileage\": 12.8,\n" +
                "      \"details\": {\n" +
                "        \"price\": 25550.20,\n" +
                "        \"fuelType\": \"Diesel\",\n" +
                "        \"noOfSeats\": 7\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "]\n" +
                "}";

        return str;
    }
}
