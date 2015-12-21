package com.example.chapter4;

import junit.framework.TestCase;
import org.junit.Test;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by apovarkov on 21.12.15.
 */
public class Recipe_04_07Test extends TestCase {

    private static final String SAMPLE_DATE = "20151221";

    @Test
    public void testGetCurrentDate() {
        LocalDate localDate = LocalDate.of(2015, 12, 21);
        assertEquals(localDate, Recipe_04_07.getCurrentDate(SAMPLE_DATE, DateTimeFormatter.BASIC_ISO_DATE));
    }
}
