package com.example.chapter5;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by apovarkov on 28.01.16.
 */
public class MySingletonTest extends TestCase {
    private MySingleton mySingleton1;
    private MySingleton mySingleton2;

    @Before
    public void setUp() {

    }

    @Test
    public void testSingleObject() {
        assertEquals(MySingleton.getInstance(), MySingleton.getInstance());
        assertTrue(MySingleton.getInstance() == MySingleton.getInstance());

        assertTrue(MySingletonEnum.INSTANCE == MySingletonEnum.INSTANCE);
        assertEquals(MySingletonEnum.INSTANCE, MySingletonEnum.INSTANCE);
    }

    @Test
    public void testMultiThreadObject() throws InterruptedException {

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                mySingleton1 = MySingleton.getInstance();
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                mySingleton2 = MySingleton.getInstance();
            }
        };

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        assertEquals(mySingleton1, mySingleton2);
        assertTrue(mySingleton1 == mySingleton2);
        assertFalse(mySingleton1 == null);
        assertFalse(mySingleton2 == null);

    }

    @After
    public void tearDown() {
        mySingleton1 = null;
        mySingleton2 = null;

    }
}
