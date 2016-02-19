package com.example.chapter6;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.function.Function;

/**
 * Created by apovarkov on 05.02.16.
 */
public class Recipe_06_02Test extends TestCase {
    public static final String ONE_WORD_EXPECTATION = "OLLEH";
    public static final String MULTI_WORD_EXPECTATION = "OLLEH DLROW";
    public static final String SPACE = " ";
    public static final String EMPTY_STRING = "";
    private Recipe_06_02.ReverseType lambda;
    private Function<String, String> theSameLambda;

    @Before
    public void setUp() {
        lambda = (testText) -> {
            String tempStr = EMPTY_STRING;
            StringBuilder stringBuilder = new StringBuilder();
            for (String part : testText.split(SPACE)) {
                stringBuilder.append(new StringBuilder(part).reverse()).append(SPACE);
            }
            tempStr = stringBuilder.toString().trim();
            return tempStr;
        };

        theSameLambda = (testText) -> {
            String tempStr = EMPTY_STRING;
            StringBuilder stringBuilder = new StringBuilder();
            for (String part : testText.split(SPACE)) {
                stringBuilder.append(new StringBuilder(part).reverse()).append(SPACE);
            }
            tempStr = stringBuilder.toString().trim();
            return tempStr;
        };
    }

    @Test
    public void testLambda() {
        assertEquals(ONE_WORD_EXPECTATION, lambda.reverse("HELLO"));
        assertEquals(MULTI_WORD_EXPECTATION, lambda.reverse("HELLO WORLD"));
    }

    @Test
    public void testSameLambda() {
        assertEquals(ONE_WORD_EXPECTATION, theSameLambda.apply("HELLO"));
        assertEquals(MULTI_WORD_EXPECTATION, theSameLambda.apply("HELLO WORLD"));
    }

    @After
    public void tearDown() {
        lambda = null;
        theSameLambda = null;
    }

}
