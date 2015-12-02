package com.example.chapter2;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by apovarkov on 02.12.15.
 */
@Repeatable(value=Roles.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Role {
    String name() default "AUTHOR";
}
