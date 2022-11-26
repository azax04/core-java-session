package java_loop;

public class JavaLoopPractice {
    public static void main(String[] args) {
        int a = 1;

        while (a <= 10){
            System.out.println(a);
            ++a;
        }

        int b = 1;

        do {
            System.out.println(b);
            b++;
        }
        while (b <= 10);



        for (int x = 10; x >= 1; x--){
            System.out.println(x);
        }
    }
}
