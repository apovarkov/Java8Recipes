package com.example.chapter4;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * Created by apovarkov on 13.01.16.
 */
public class Recipe_04_06Test extends TestCase {
    private static final long SEED_1 = 12l;
    private static final long SEED_2 = 15l;
    private Random random1;
    private Random random2;

    @Before
    public void setUp() {
        random1 =  new Random();
        random2 = new Random();
    }

    @After
    public void tearDown() {
        random1 = null;
        random2 = null;
    }

    @Test
    public void testRandomSameSeed(){
        random1.setSeed(SEED_1);
        random2.setSeed(SEED_1);

        assertEquals(random1.nextInt(), random2.nextInt());
        assertEquals(random1.nextLong(), random2.nextLong());
        assertEquals(random1.nextDouble(), random2.nextDouble());
        assertEquals(random1.nextGaussian(), random2.nextGaussian());

    }

    @Test
    public void testRandomDistinctSeed(){
        random1.setSeed(SEED_1);
        random2.setSeed(SEED_2);

        assertFalse(random1.nextInt() == random2.nextInt());
        assertFalse(random1.nextLong() == random2.nextLong());
        assertFalse(random1.nextDouble() == random2.nextDouble());
        assertFalse(random1.nextGaussian() == random2.nextGaussian());

    }

}
