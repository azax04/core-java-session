package sortingarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortString {
    public static void main(String[] args) {
//        ArrayList <String> cars = new ArrayList<>();

        String[] carsBrand = {"Honda", "Toyota", "Nissan", "Volvo", "BMW", "Mercedes"};
        System.out.println(Arrays.toString(carsBrand));

//        Collections.sort(Arrays.toString(carsBrand));
        Arrays.sort(carsBrand);
        System.out.println(Arrays.toString(carsBrand));

    }
}
