package day3;

public class PTRConcept {

    public static void main(String[] args) {

        int p1 = 10000;
        float t1 = 1.8f;
        int r1 = 5;

        //double interestRate = (p1 * t1 * r1) / 100;
        float si = p1*t1*r1/100;
        System.out.println(si);


        int p = 2000;
        float t = 0.7f;
        int r = 3;

        //float iR = (p * t * r) / 100;
        float si1 = iRAndReturn(p,t,r);
        System.out.println(si1);


        float p2 = 50000.55f;
        float t2 = 2.9f;
        float r2 = 1.6f;

        //float si2 = p2, t2, r2;
        float si2 = iRAndReturn(p2,t2,r2);
        System.out.println(si2);
    }

    public static void simpleInterest(int p, double t, int r){
        double simpleInterest = (p * t * r / 100);
        System.out.println(simpleInterest);

    }

    public static float iRAndReturn(int p, float t, int r){
        float si = p*t*r/100;
        return si;
    }

    public static float iRAndReturn(float p, float t, float r) {
        float si = p * t * r / 100;
        return si;

    }


    }

