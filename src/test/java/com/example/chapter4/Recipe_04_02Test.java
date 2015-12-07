package com.example.chapter4;

import junit.framework.TestCase;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by apovarkov on 07.12.15.
 */
public class Recipe_04_02Test extends TestCase {
    @Test
    public void testFormatDouble() {
        assertEquals("7.420", Recipe_04_02.formatDouble(7.42));
        assertEquals("345.937", Recipe_04_02.formatDouble(345.9372));
        assertEquals(".770", Recipe_04_02.formatDouble(.7697));
    }

    @Test
    public void testFormatDollars() {
        BigDecimal currencyOne = new BigDecimal("231.22");
        assertEquals("$231.22", Recipe_04_02.formatDollars(currencyOne.doubleValue()));
    }
}
