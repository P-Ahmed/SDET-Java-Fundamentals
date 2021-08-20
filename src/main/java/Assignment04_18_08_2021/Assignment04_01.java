/*1. Find the date difference (year, day, hour, min, sec) between your birthdate and today*/

package Assignment04_18_08_2021;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Assignment04_01 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa"); //12 hours format
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss"); //24 hours format

        Date date = new Date(); //creating date object
        long presentDateTimeStamp = date.getTime(); //Getting timestamp for present date-time

        String birthday = "16-08-1995 04:00:00 AM";
        Date convertedBirthday = sdf.parse(birthday);
        long birthdayTimeStamp = convertedBirthday.getTime(); //Getting timestamp for birthday date-time
        long presentAge = presentDateTimeStamp - birthdayTimeStamp;
        long year = presentAge / (1000l * 365 * 24 * 60 * 60);
        long day = presentAge / (1000l * 24 * 60 * 60) % 365;
        long hour = (presentAge / (1000l * 60 * 60)) % 24;
        long minute = (presentAge / (1000l * 60)) % 60;
        long second = (presentAge / 1000l) % 60;
        System.out.println("Year: " + year);
        System.out.println("Day: " + day);
        System.out.println("Hour " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second " + second);
    }
}
