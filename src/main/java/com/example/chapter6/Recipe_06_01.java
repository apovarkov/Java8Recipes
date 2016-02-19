package com.example.chapter6;

/**
 * Created by apovarkov on 05.02.16.
 */
public class Recipe_06_01 {
    @FunctionalInterface
    public interface HelloType {
        /**
         * Function that will be implemented within the lambda
         *
         * @param text
         */
        void hello(String text);
    }
}
