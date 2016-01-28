package com.example.chapter4;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Created by apovarkov on 14.01.16.
 */
public class Recipe_04_13Test extends TestCase {
    @Test
    public void testTZ() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zone is: " + zonedDateTime.getZone());
        System.out.println("Zone rules are: " + zonedDateTime.getZone().getRules());
        assertTrue(true);
    }

    @Test
    public void testComparison() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        LocalDate anotherDate = LocalDate.of(2015, 12, 12);
        ZonedDateTime anotherDateTime = ZonedDateTime.of(anotherDate, LocalTime.of(12, 12), zonedDateTime.getZone());
        assertTrue(zonedDateTime.compareTo(anotherDateTime) > 0);
    }

    @Test
    public void testIntervals() {
        LocalDate anotherDate = LocalDate.of(2016, 02, 10);
        LocalDate firstDate = LocalDate.of(2015, 12, 12);
        Period period = Period.between(firstDate, anotherDate);
        assertEquals(29, period.getDays());
        assertEquals(1, period.getMonths());
        assertEquals(0, period.getYears());

        assertEquals(60, ChronoUnit.DAYS.between(firstDate, anotherDate));

        Calendar date1 = Calendar.getInstance();
        date1.set(firstDate.getYear(), firstDate.getMonthValue(), firstDate.getDayOfMonth());

        Calendar date2 = Calendar.getInstance();
        date2.set(anotherDate.getYear(), anotherDate.getMonthValue(), anotherDate.getDayOfMonth());

        long days = TimeUnit.MILLISECONDS.toDays(Math.abs(date1.getTimeInMillis() - date2.getTimeInMillis()));
        assertEquals(58, days);
    }


}
