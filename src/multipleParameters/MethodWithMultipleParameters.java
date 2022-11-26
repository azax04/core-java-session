package multipleParameters;

public class MethodWithMultipleParameters {
    public static void main(String[] args) {
        int sum1 = add(1, 2);
        System.out.println(sum1);

        int sum2 = add(1, 2, 3);
        System.out.println(sum2);

        int sum3 = add(1, 2, 3, 4);
        System.out.println(sum3);

        int sum4 = add(1, 2, 3, 4, 5);
        System.out.println(sum4);
    }

    public static int add(int... numbers) {
       int tempSum = 0;
        for (int element : numbers) {
            tempSum = tempSum + element;
        }
        return tempSum;

    }

//    public static int add(int a, int b, int c) {
//        return a+b+c;
//    }

}
