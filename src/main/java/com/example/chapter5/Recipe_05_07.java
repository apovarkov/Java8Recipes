package com.example.chapter5;

import java.util.List;

/**
 * Created by apovarkov on 29.01.16.
 */
public interface Recipe_05_07 {

    List<String> getSkills();

    void setSkills(List<String> skills);

    void addSkill(String skill);

    default void listSkills() {
        getSkills().stream().forEach((skill) -> {
            System.out.println(skill);
        });
    }
}
