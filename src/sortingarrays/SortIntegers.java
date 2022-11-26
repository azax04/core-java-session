package sortingarrays;

import java.util.Arrays;

public class SortIntegers {
    public static void main(String[] args) {

        int[] numbers = {5, 9, 4, 6, 3, 10, 8};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
