package day2;

import day2.Vehicle;

public class ApplicationClass {

    public static void main(String[] args) {

        Vehicle honda = new Vehicle();
        honda.brand = "Honda";
        honda.model = "CRV";
        honda.year = 2019;
        honda.trim = "LX";
        honda.color = "Red";
        honda.driveType = "All_Wheel_Drive";
        honda.mileage = 5;
        honda.price = 25000;
        honda.transmission = "CVT";
        honda.vinNumber = "123ADV12VSA1ASD12344";

        System.out.println(honda.vinNumber);



        Vehicle toyota = new Vehicle();
        toyota.brand = "Toyota";
        toyota.model = "XLE";
        toyota.year = 2021;
        toyota.trim = "Hybrid";
        toyota.color = "Blue";
        toyota.driveType = "All Wheel Drive";
        toyota.mileage = 10;
        toyota.price = 30000;
        toyota.transmission = "Automatic";
        toyota.vinNumber = "SKGH2435RFJDKGW9T";

    }
}
