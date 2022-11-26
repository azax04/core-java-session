package salesoutput;

import java.util.Scanner;

public class SalesModule {

    private static final int TARGET = 5000;

    public static void main(String[] args) {

        Scanner sales = new Scanner(System.in);
        System.out.println("Name of Person:");

        String name = sales.nextLine();
        String greeting = String.format("Hello %s, ", name);
        System.out.println(greeting);

        System.out.println("Your sales for the day: ");
        int salesBonus = sales.nextInt();
        int bonus = 0;

        if (salesBonus >= 2 * TARGET) {
            bonus += 1000;
            System.out.printf("Your bonus for the day is: %d", bonus);

        } else if (salesBonus >= 1.5 * TARGET) {
            bonus += 500;
            System.out.printf("Your bonus for the day is: %d", bonus);

        } else if (salesBonus >= TARGET) {
            bonus = +100;
            System.out.printf("Your bonus for the day is: %d", bonus);

        } else {
            System.out.printf("You did not get any bonuses for today. %d", bonus);
        }



    }
}
