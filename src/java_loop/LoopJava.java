package java_loop;

public class LoopJava {
    public static void main(String[] args) {

        int a = 10;
        while (a >= 1) {
            System.out.println(a);
            a--;
        }
        System.out.println("This is while loop method!");

        int b = 10;
        do {
            System.out.println(b);
            b--;
        }
        while (b >= 1);
        System.out.println("This is do-while loop method!");


        int c;
        for (c = 10; c >= 1; c--) {
            System.out.println(c);
        }
        System.out.println("This is for-loop method!");


    }

}
