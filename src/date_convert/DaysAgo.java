package date_convert;


public class DaysAgo {

    public static void main(String[] args) {

        long milliSecondPerSecond = 60 * 1000;
        long milliSecondPerMinute = milliSecondPerSecond * 60;
        long milliSecondPerHour = milliSecondPerMinute * 60;
        long milliSecondPerDay = milliSecondPerHour * 24;
        long milliSecondPerMonth = milliSecondPerDay * 30;
        long milliSecondPerYear = milliSecondPerDay * 365;


//        Calendar birthDay = Calendar.getInstance();
//        birthDay.set(Calendar.YEAR, 2022);
//        birthDay.set(Calendar.MONTH, 8);
//        birthDay.set(Calendar.DAY_OF_MONTH, 25);
//
//        System.out.println(birthDay.getTime());
//
//
//        //To format the date and time
//        SimpleDateFormat formattedDate = new SimpleDateFormat("MMM-dd-yyyy HH:mm:ss");
//        String dateFormat = formattedDate.format(birthDay.getTime());
//        System.out.println(dateFormat);
//
//        Calendar oldTime = Calendar.getInstance();
//        oldTime.set(Calendar.YEAR, 2022);
//        oldTime.set(Calendar.MONTH, 8);
//        oldTime.set(Calendar.DAY_OF_MONTH, 25);
//
//        Calendar currentDate = Calendar.getInstance();
//        System.out.println(currentDate.getTime());


    }

}
