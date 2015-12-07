package com.example.chapter4;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by apovarkov on 07.12.15.
 */
public class Recipe_04_01Test extends TestCase {
    @Test
    public void testRoundFloatToInt() {
        assertEquals(5, Recipe_04_01.roundFloatToInt(5.1f));
        assertEquals(6, Recipe_04_01.roundFloatToInt(5.7f));
        assertEquals(0, Recipe_04_01.roundFloatToInt(Float.NaN));
    }
    @Test
    public void testRoundDoubleToLong() {
        assertEquals(Long.MIN_VALUE, Recipe_04_01.roundDoubleToLong(Double.NEGATIVE_INFINITY));
        assertEquals(Long.MAX_VALUE, Recipe_04_01.roundDoubleToLong(Double.POSITIVE_INFINITY));
        assertEquals(0, Recipe_04_01.roundDoubleToLong(Double.NaN));
    }
}
