import java.io.*;
import java.util.*;

class Result {

    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);  

        String[] days = {
            "SUNDAY", "MONDAY", "TUESDAY", 
            "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"
        };

        return days[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }
}

public class dayOfTheWeek {
    public static void main(String[] args) throws IOException {


        String res = Result.findDay(10, 18, 2005);
        System.out.println(res);  

    }
}
