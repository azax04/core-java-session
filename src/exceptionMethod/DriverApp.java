package exceptionMethod;

import java.util.Scanner;

public class DriverApp {

    Authorization authorization = new Authorization();

    public static void main(String[] args) {

        Scanner driver = new Scanner(System.in);
        System.out.println("The name of Driver:");

        String name = driver.nextLine();
        String greeting = String.format("Hello %s, ", name);
        System.out.println(greeting);


        System.out.println("Your Age Here: ");


        System.out.println("Your email here: ");


        System.out.println("Your password here: ");

    }
}
