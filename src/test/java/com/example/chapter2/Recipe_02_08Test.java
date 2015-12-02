package com.example.chapter2;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apovarkov on 02.12.15.
 */
public class Recipe_02_08Test extends TestCase {
    private List<String> inputData;

    @Before
    public void setUp() {
        inputData = new ArrayList<String>();
        // Populate the list
        for(int x = 0; x <= 10; x++){
            inputData.add("Test " + x);
        }
    }

    @Test
    public void testSuccess() {
        Recipe_02_08.printCollection(inputData);
        assertTrue(true);
    }

    @Test
    public void testEmpty() {
        Recipe_02_08.printCollection(null);
        assertTrue(true);
    }

    @After
    public void tearDown() {
        inputData = null;
    }
}
