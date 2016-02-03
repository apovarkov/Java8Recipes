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
    public static final String PARENT_NAME = "Heorgy";
    private Recipe_05_10 testObject;

    @Before
    public void setUp() {
        testObject = new Recipe_05_10();
        testObject.setCity(CITY);
        testObject.setName(NAME);
        testObject.setParent(new Recipe_05_10());
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
        assertEquals(deepClone, shallowClone);

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
        assertEquals(deepClone, shallowClone);

    }

    @Test
    public void testDeepClone() {
        Recipe_05_10 deepClone = (Recipe_05_10) testObject.clone();
        Recipe_05_10 shallowClone = (Recipe_05_10) testObject.shallowCopyClone();

        testObject.getParent().setName(PARENT_NAME);

        assertFalse(testObject == deepClone);
        assertFalse(testObject == shallowClone);
        assertFalse(deepClone == shallowClone);
        assertFalse(testObject.equals(deepClone));
        assertTrue(testObject.equals(shallowClone));
        assertFalse(deepClone.equals(shallowClone));

    }

    @After
    public void tearDown() {
        testObject = null;
    }
}
