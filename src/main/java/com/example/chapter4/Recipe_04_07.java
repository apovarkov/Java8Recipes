package com.example.chapter4;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.zone.ZoneRules;
import java.util.Date;
import java.util.logging.Logger;

/**
 * Created by apovarkov on 21.12.15.
 */
public class Recipe_04_07 {
    private static final Logger LOG = Logger.getLogger(String.valueOf(Recipe_04_07.class));

    public static String getCurrentDate(DateTimeFormatter formatter) {
        LocalDate localDate = LocalDate.now();
        return localDate.format(formatter);
    }

    public static LocalDate getCurrentDate(String date, DateTimeFormatter formatter) {
        return LocalDate.parse(date, formatter);
    }

    public static void main(String[] args) {
        LocalDateTime checkOut = LocalDateTime.now();
        ZoneId checkOutZone = ZoneId.of("US/Eastern");
        LocalDateTime checkIn = checkOut.plusDays(3);
        ZoneId checkInZone = ZoneId.of("US/Mountain");
        scheduleReport(checkOut, checkOutZone, checkIn, checkInZone);
    }

    public static void localDateSmth() {
        LocalDateTime ldt = LocalDateTime.now();
        LOG.info("Local Date and Time: " + ldt);

        // Obtain the month from LocalDateTime object
        Month month = ldt.getMonth();
        int monthValue = ldt.getMonthValue();
        LOG.info("Month: " + month);
        LOG.info("Month Value: " + monthValue);
        // Obtain day of Month, Week, and Year
        int day = ldt.getDayOfMonth();
        DayOfWeek dayWeek = ldt.getDayOfWeek();
        int dayOfYr = ldt.getDayOfYear();
        LOG.info("Day: " + day);
        LOG.info("Day Of Week: " + dayWeek);
        LOG.info("Day of Year: " + dayOfYr);
        // Obtain year
        int year = ldt.getYear();
        LOG.info("Date: " + monthValue + "/" + day + "/" + year);
        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        int second = ldt.getSecond();
        LOG.info("Current Time: " + hour + ":" + minute + ":" + second);
        // Calculation of Months, etc.
        LocalDateTime currMinusMonths = ldt.minusMonths(12);
        LocalDateTime currMinusHours = ldt.minusHours(10);
        LocalDateTime currPlusDays = ldt.plusDays(30);
        LOG.info("Current Date and Time Minus 12 Months: " + currMinusMonths);
        LOG.info("Current Date and Time MInus 10 Hours: " + currMinusHours);
        LOG.info("Current Date and Time Plus 30 Days:" + currPlusDays);
    }


    public static void scheduleReport(LocalDateTime checkOut, ZoneId checkOutZone,
                                      LocalDateTime checkIn, ZoneId checkInZone) {
        ZonedDateTime beginTrip = ZonedDateTime.of(checkOut, checkOutZone);
        System.out.println("Trip Begins: " + beginTrip);
        // Get the rules of the check out time zone
        ZoneRules checkOutZoneRules = checkOutZone.getRules();
        System.out.println("Checkout Time Zone Rules: " + checkOutZoneRules);
        //If the trip took 4 days
        ZonedDateTime beginPlus = beginTrip.plusDays(4);
        System.out.println("Four Days Later: " + beginPlus);
        // End of trip in starting time zone
        ZonedDateTime endTripOriginalZone = ZonedDateTime.of(checkIn, checkOutZone);
        ZonedDateTime endTrip = ZonedDateTime.of(checkIn, checkInZone);
        int diff = endTripOriginalZone.compareTo(endTrip);
        String diffStr = (diff >= 0) ? "NO" : "YES";
        System.out.println("End trip date/time in original zone: " + endTripOriginalZone);
        System.out.println("End trip date/time in check-in zone: " + endTrip);
        System.out.println("Original Zone Time is less than new zone time? " +
                diffStr);
        ZoneId checkOutZoneId = beginTrip.getZone();
        ZoneOffset checkOutOffset = beginTrip.getOffset();
        ZoneId checkInZoneId = endTrip.getZone();
        ZoneOffset checkInOffset = endTrip.getOffset();
        System.out.println("Check out zone and offset: " + checkOutZoneId + checkOutOffset);
        System.out.println("Check in zone and offset: " + checkInZoneId + checkInOffset);
    }

}


