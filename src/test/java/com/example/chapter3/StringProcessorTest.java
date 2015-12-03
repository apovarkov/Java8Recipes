package com.example.chapter3;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by apovarkov on 03.12.15.
 */
public class StringProcessorTest extends TestCase {
    @Test
    public void testReverseString() {
        assertEquals("gnirtS", StringProcessor.reverseString("String"));
    }

}
