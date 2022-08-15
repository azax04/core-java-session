package day3;

public class PTRConcept {

    public static void main(String[] args) {

        int p1 = 10000;
        float t1 = 1.8f;
        int r1 = 5;

        //double interestRate = (p1 * t1 * r1) / 100;
        int si = (int) ((p1*t1*r1)/100);
        System.out.println(si);


        int p = 2000;
        float t = 0.7f;
        int r = 3;

        //float iR = (p * t * r) / 100;
        int si1 = (int) ((p*t*r)/100);
        System.out.println(si1);
    }

    public static void simpleInterest(int p, double t, int r){
        double simpleInterest = (p * t * r / 100);
        System.out.println(simpleInterest);

    }

    public static int addAndReturn(int p, float t, int r){
        int si = (int) ((p*t*r)/100);
        return si;
    }


    }

