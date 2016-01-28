package com.example.chapter5;

import java.io.Serializable;

/**
 * Created by apovarkov on 28.01.16.
 */
public class MySingleton implements Serializable {
    private static volatile MySingleton instance;

    private MySingleton() {
        super();
    }

    public static MySingleton getInstance() {
        synchronized (MySingleton.class) {
            if (instance == null) {
                instance = new MySingleton();
            }

            return instance;
        }
    }
}
