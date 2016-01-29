package com.example.chapter5;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by apovarkov on 29.01.16.
 */
public class MyBuilderTest extends TestCase {
    private static final String FIRST_NAME = "Aleksey";
    private static final String LAST_NAME = "Povarkov";
    public static final int AGE = 33;
    public static final boolean MARRIED = true;
    private MyBuilder.Builder builder;
    private MyBuilder myBuilder;

    @Before
    public void setUp() {
        builder = new MyBuilder.Builder(FIRST_NAME, LAST_NAME);
    }

    @Test
    public void testBuilder() {
        myBuilder = builder.age(AGE).married(MARRIED).build();
        assertEquals(AGE, myBuilder.getAge());
        assertEquals(MARRIED, myBuilder.isMarried());
        assertEquals(FIRST_NAME, myBuilder.getFirstName());
        assertEquals(LAST_NAME, myBuilder.getLastName());
    }

    @After
    public void tearDown(){
        builder = null;
        myBuilder = null;
    }
}
