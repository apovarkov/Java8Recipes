package com.example.chapter2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by apovarkov on 02.12.15.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Roles {
    Role[] value();
}
