package com.example.chapter4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by apovarkov on 21.12.15.
 */
public class Recipe_04_07 {
    public static String getCurrentDate(DateTimeFormatter formatter) {
        LocalDate localDate = LocalDate.now();
        return localDate.format(formatter);
    }

    public static LocalDate getCurrentDate(String date, DateTimeFormatter formatter) {
        return LocalDate.parse(date, formatter);
    }

}
