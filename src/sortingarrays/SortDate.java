package sortingarrays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;


public class SortDate {
    public static void main(String[] args) {
         String[] stringDates = new String[5];
         stringDates[0] = "09-10-2022 10:45:10 AM";
         stringDates[1] = "12-28-2018 09:50:45 PM";
         stringDates[2] = "09-01-2022 12:45:30 PM";
         stringDates[3] = "09-10-2020 07:30:25 AM";
         stringDates[4] = "05-10-2022 04:25:10 PM";

        System.out.println("================= Date before sorting");
        System.out.println(Arrays.toString(stringDates));

        Arrays.sort(stringDates);

        System.out.println("================= Date after sorting ");
        SimpleDateFormat formattedDate = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss aa");
        System.out.println(Arrays.toString(stringDates));

        Date[] dates = new Date[5];

        for (int i=0; i< stringDates.length; i++){
            try {
                dates[i] = formattedDate.parse(stringDates[i]);
            } catch (ParseException e) {
               e.printStackTrace();
            }

        }
        System.out.println(Arrays.toString(dates));

        Arrays.sort(dates);

        System.out.println(Arrays.toString(dates));

    }
}
