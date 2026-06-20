package dateexample;

import java.util.Date;

public class DateExample {
    public static void main(String[] args) {


        // Create Date objects with different elapsed times
        Date date1 = new Date(0);
        Date date2 = new Date(1000);
        Date date3 = new Date(10000);
        Date date4 = new Date(100000);
        Date date5 = new Date(1000000);
        Date date6 = new Date(10000000);
        Date date7 = new Date(100000000);
        Date date8 = new Date(1000000000);

        // Display the dates and times
        System.out.println("Date at 0 seconds: " + date1.toString());
        System.out.println("Date at 10,000 milliseconds: " + date2.toString());
        System.out.println("Date at 100,000 milliseconds: " + date3.toString());
        System.out.println("Date at 1,000,000 milliseconds: " + date4.toString());
        System.out.println("Date at 10,000,000 milliseconds: " + date5.toString());
        System.out.println("Date at 100,000,000 milliseconds: " + date6.toString());
        System.out.println("Date at 1,000,000,000 milliseconds: " + date7.toString());
        System.out.println("Date at 10,000,000,000 milliseconds: " + date8.toString());

    }
    
}
