package com.lambton;

//Created by Ramanpreet Singh
public class MainClass {

    // Main function
    public static void main(String[] args)
    {
        InternEmployee i = new InternEmployee("Matthew",  24, "Lambton College");
        i.printMyData();

        CommissionBasedPartTimeEmployee c = new CommissionBasedPartTimeEmployee("John", 23, 30.0f, 10, 20.0f);
        c.printMyData();

        FixedBasedPartTimeEmployee f = new FixedBasedPartTimeEmployee("Cindy", 40, 30.0f, 10, 40.0f);
        f.printMyData();

    }
}
