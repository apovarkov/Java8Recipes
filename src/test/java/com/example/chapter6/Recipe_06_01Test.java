package com.example.chapter6;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by apovarkov on 05.02.16.
 */
public class Recipe_06_01Test extends TestCase {

    public static final String EXPECTATION = "Hello Lambda\n";
    private Recipe_06_01.HelloType helloLambda;
    private Recipe_06_01.HelloType helloAnotherLambda;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();


    @Before
    public void setUp() {
        // Create the lambda, passing a parameter named "text" to the
        // hello() method, returning the string.  The lambda is assigned
        // to the helloLambda variable.
        helloLambda =
                (String text) -> {
                    System.out.println("Hello " + text);
                };
        helloAnotherLambda = text -> System.out.println("Hello " + text);

        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

    }

    @Test
    public void testLambda() {
        // Invoke the method call
        helloLambda.hello("Lambda");
        assertEquals(EXPECTATION, outContent.toString());
    }

    @Test
    public void testAnotherLambda() {
        // Invoke the method call
        helloAnotherLambda.hello("Lambda");
        assertEquals(EXPECTATION, outContent.toString());
    }

    @After
    public void tearDown() throws IOException {
        helloLambda = null;
        helloAnotherLambda= null;
        System.setOut(null);
        System.setErr(null);
        outContent.close();
        errContent.close();
    }
}
