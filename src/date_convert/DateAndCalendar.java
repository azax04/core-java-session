package date_convert;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);

        //
        //
        //

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);


        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.set(Calendar.YEAR, 1989);
        birthCalendar.set(Calendar.MONTH, 11);
        birthCalendar.set(Calendar.DAY_OF_MONTH, 14);
        System.out.println(birthCalendar);

        System.out.println(birthCalendar.getTime());


    }


}
