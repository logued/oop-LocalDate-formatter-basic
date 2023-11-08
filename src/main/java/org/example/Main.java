package org.example;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("LocalDate - formatter demonstration");

        // Dates are often displayed in the String format shown below - in human-readable form.
        String strDate = "27-10-2023";  // dd-MM-yyy format

        // However, in Java it is better to store dates using a LocalDateTime class.
        // We need to use a formatter to tell Java what format to use to
        // convert our date in String format into LocalDateTime format.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // convert date from string format into a date format
        LocalDate localDate = LocalDate.parse(strDate, formatter);

        System.out.println("LocalDate without formatter: " + localDate);  //
        System.out.println("LocalDate with dd-MM-yyy formatter applied: " + localDate.format(formatter));

        ZoneId zoneId = ZoneId.systemDefault();
        long epoch = localDate.atStartOfDay(zoneId).toEpochSecond();
        System.out.println("LocalDate as Unix Timestamp (epoch) : " + epoch + " seconds since Jan 1st 1970");

    }
}