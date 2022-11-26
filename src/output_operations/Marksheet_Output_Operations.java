package output_operations;

import java.util.Scanner;

public class Marksheet_Output_Operations {
    public static void main(String[] args) {

        Scanner marksheet = new Scanner(System.in);
        System.out.println("Name of Student");
        String name = marksheet.nextLine();

        System.out.println("Marks obtained in physics: ");
        float physics = marksheet.nextFloat();

        System.out.println("Marks obtained in chemistry: ");
        float chemistry = marksheet.nextFloat();

        System.out.println("Marks obtained in biology: ");
        float biology = marksheet.nextFloat();

        System.out.println("Marks obtained in math: ");
        float math = marksheet.nextFloat();

        System.out.println("Marks obtained in computer: ");
        float computer = marksheet.nextFloat();


        float totalPercentage = ((physics + chemistry + biology + math + computer) / 500f * 100);
//        System.out.println(totalPercentage);

        String outputPercentage = String.format("%s percentage = %.2f", name, totalPercentage);
        System.out.println(outputPercentage);

        System.out.print(name + " is passed with ");

        if (totalPercentage >= 85) {
            System.out.println("Distinction");
        } else if (totalPercentage >= 65 && totalPercentage <85) {
            System.out.println("First Division");
        } else if (totalPercentage >= 50 && totalPercentage <65) {
            System.out.println("First Division");
        } else if (totalPercentage >= 40 && totalPercentage <50) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail Division");
        }

    }
}
