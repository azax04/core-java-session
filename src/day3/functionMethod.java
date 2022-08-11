package day3;

public class functionMethod {

    public static void main(String[] args) {

        int a=2;
        int b=5;
        int c=13;
//        add(a,b,c);
        int add1 = addAndReturn(a,b,c);
        System.out.println(add1);


        int d=3;
        int e=9;
        int f=18;
//        add(d,e,f);
        int add2 = addAndReturn(d,e,f);
        System.out.println(add2);

        int g=5;
        int h=20;
        int i=25;
//        add(g,h,i);
        int add3 = addAndReturn(g,h,i);
        System.out.println(add3);
    }

    public static int addAndReturn (int a, int b, int c){
        int add1 = a+b+c;
        return add1;
    }

    public static void add(int a, int b, int c){
        int add = a+b+c;
        System.out.println(add);
    }

}
