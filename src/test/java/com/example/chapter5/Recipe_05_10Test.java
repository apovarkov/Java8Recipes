package com.example.chapter5;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by apovarkov on 03.02.16.
 */
public class Recipe_05_10Test extends TestCase {
    private static final String CITY = "Minsk";
    private static final String NAME = "Aleksey";
    private static final String ANOTHER_NAME = "Alexander";
    private Recipe_05_10 testObject;

    @Before
    public void setUp() {
        testObject = new Recipe_05_10();
        testObject.setCity(CITY);
        testObject.setName(NAME);
    }

    @Test
    public void testUnchangedClone() {
        Recipe_05_10 deepClone = (Recipe_05_10) testObject.clone();
        Recipe_05_10 shallowClone = (Recipe_05_10) testObject.shallowCopyClone();

        assertFalse(testObject == deepClone);
        assertFalse(testObject == shallowClone);
        assertFalse(deepClone == shallowClone);
        assertEquals(testObject, deepClone);
        assertEquals(testObject, shallowClone);

    }

    @Test
    public void testChangedClone() {
        Recipe_05_10 deepClone = (Recipe_05_10) testObject.clone();
        Recipe_05_10 shallowClone = (Recipe_05_10) testObject.shallowCopyClone();

        deepClone.setName(ANOTHER_NAME);
        shallowClone.setName(ANOTHER_NAME);

        assertFalse(testObject == deepClone);
        assertFalse(testObject == shallowClone);
        assertFalse(deepClone == shallowClone);
        assertFalse(testObject.equals(deepClone));
        assertFalse(testObject.equals(shallowClone));

    }

    @After
    public void tearDown() {
        testObject = null;
    }
}
