package com.example.chapter3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by apovarkov on 03.12.15.
 */
public class StringProcessor {
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
