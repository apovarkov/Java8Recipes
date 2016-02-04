package com.example.chapter5;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by apovarkov on 04.02.16.
 */
public class Recipe_05_14Test extends TestCase {
    private Recipe_05_14 testObject;

    @Before
    public void setUp() {
        testObject = new Recipe_05_14();
    }

    @Test
    public void test1() {
        for (Recipe_05_14.Player player : testObject.getPlayerList()) {
            System.out.println(player.playerString());
        }

        assertTrue(true);
    }

    @After
    public void tearDown() {
        testObject = null;
    }

}
