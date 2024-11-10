import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Date today = new Date();

        GregorianCalendar calendar = new GregorianCalendar();

        calendar.setTime(today);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH)-1);
        System.out.println(calendar.getTime());

        GregorianCalendar birthday = new GregorianCalendar(1899,0, 13);
        Date birthdayDate = birthday.getTime();

        System.out.println(today);
        System.out.println(birthdayDate);
        System.out.println(birthday);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String prettyDate = sdf.format(birthdayDate);
        System.out.println(prettyDate);

        LocalDateTime theDateAndTime = LocalDateTime.now();
        LocalDateTime anotherDateAndTime = LocalDateTime.of(2022, 11, 16, 18, 34);
        LocalDate someDate = LocalDate.of(2024, 11, 16);
        LocalTime someTime = LocalTime.from(anotherDateAndTime);

        System.out.println(theDateAndTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm")));
        System.out.println(someTime);

    }
}