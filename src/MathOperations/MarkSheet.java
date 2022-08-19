package MathOperations;

public class MarkSheet {
    public static void main(String[] args) {

    /*This program assumes 100 marks of total in each subject
           And total marks for the MarkSheet becomes 600 for six subjects.
     */
        float math = 81;
        float science = 79;
        float computer = 85;
        float english = 78;
        float literature = 71;
        float nepali = 70;

        float add = (math+science+computer+english+literature+nepali);
        //System.out.println(add);


        float percentage = (add/600)*100;
        System.out.println(percentage);


        /*
        Distinction percentage = >=80
        First Division percentage = 65 to 79
        Second Division percentage = 55 to 64
        Third Division percentage = 40 to 54
        Fail percentage = 0 to 39
        */


        boolean isDistinction = percentage >= 80;
        System.out.println("Distinction:" + isDistinction);

        boolean isFirstDivision = percentage >= 65 && percentage <80;
        System.out.println("First Division:" + isFirstDivision);

        boolean isSecondDivision = percentage >= 55 && percentage <64;
        System.out.println("Second Division:" + isSecondDivision);

        boolean isThirdDivision = percentage >= 40 && percentage <54;
        System.out.println("Third Division:" + isThirdDivision);

        boolean isFail = percentage >= 0 && percentage <39;
        System.out.println("Fail:" + isFail);


    }
}
