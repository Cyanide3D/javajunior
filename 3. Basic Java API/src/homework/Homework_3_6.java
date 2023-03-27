package homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Homework_3_6 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        DateTimeFormatter longFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        System.out.println(localDateTime.format(longFormat));
        System.out.println(localDateTime.format(mediumFormat));
        System.out.println(localDateTime.format(shortFormat));

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd:MM:yyyy HH.mm");

        System.out.println(dateTimeFormatter1.format(localDateTime));
        System.out.println(dateTimeFormatter2.format(localDateTime));
        System.out.println(dateTimeFormatter3.format(localDateTime));

        LocalDateTime date1 = LocalDateTime.parse("01.01.1997 12:05", dateTimeFormatter1);
        LocalDateTime date2 = LocalDateTime.parse("01-01-1997 12-05", dateTimeFormatter2);
        LocalDateTime date3 = LocalDateTime.parse("01:01:1997 12.05", dateTimeFormatter3);

        System.out.println(date1.format(dateTimeFormatter1));
        System.out.println(date2.format(dateTimeFormatter2));
        System.out.println(date3.format(dateTimeFormatter3));
    }

}
