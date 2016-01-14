package com.example.chapter4;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

/**
 * Created by apovarkov on 14.01.16.
 */
public class Recipe_04_13Test extends TestCase {
    @Test
    public void testTZ() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zone is: " + zonedDateTime.getZone());
        System.out.println("Zone rules are: " + zonedDateTime.getZone().getRules());
        assertFalse(false);

        LocalDate anotherDate = LocalDate.of(2015, 12, 12);
        ZonedDateTime anotherDateTime = ZonedDateTime.of(anotherDate, LocalTime.of(12, 12), zonedDateTime.getZone());

        assertTrue(zonedDateTime.compareTo(anotherDateTime) > 0);
    }

}
