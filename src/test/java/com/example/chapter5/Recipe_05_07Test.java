package com.example.chapter5;

import com.sun.deploy.util.ReflectionUtil;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apovarkov on 29.01.16.
 */
public class Recipe_05_07Test extends TestCase {

    public static final String EXPECTED_METHOD = "listSkills";

    @Test
    public void testDefaultMethod() {
        Recipe_05_07 recipe_05_07 = new Recipe_05_07Impl();
        List<String> skills = new ArrayList<String>();
        skills.add("Java");
        skills.add("Spring");
        skills.add("NodeJS");

        recipe_05_07.setSkills(skills);
        try {
            assertTrue(ReflectionUtil.getMethod(recipe_05_07, EXPECTED_METHOD, null, true) != null);
        } catch (Throwable throwable) {
            assertTrue(false);
        }
    }
}
