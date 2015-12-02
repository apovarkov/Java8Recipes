package com.example.chapter2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by apovarkov on 02.12.15.
 */
public class TaskMaster {
    @Role(name = "AUTHOR")
    @Role(name = "REVIEWER")
    public boolean assignWork(Worker worker) {
        try {
            Roles masterRoles = this.getClass().getMethod("assignWork", Worker.class).getDeclaredAnnotation(Roles.class);
            if (worker.getClass().isAnnotationPresent(Roles.class)) {
                Roles roles = worker.getClass().getAnnotation(Roles.class);
                for (Role role : roles.value()) {
                    for (Role mRole : masterRoles.value()) {
                        if (role.equals(mRole)) {
                            return true;
                        }
                    }

                }

            } else if (worker.getClass().isAnnotationPresent(Role.class)) {
                Role role = worker.getClass().getAnnotation(Role.class);
                for (Role mRole : masterRoles.value()) {
                    if (role.equals(mRole)) {
                        return true;
                    }
                }

            }
        } catch (
                NoSuchMethodException e
                )

        {
            e.printStackTrace();
        }

        return false;
    }
}
