package com.example.chapter2;

import java.util.Collection;

/**
 * Created by apovarkov on 02.12.15.
 */
public class Recipe_02_08 {
    public static void printCollection(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            System.out.println("Collection is EMPTY");
            return;
        }

        collection.stream().forEach((value) -> {
            System.out.println(value);
        });
    }
}
