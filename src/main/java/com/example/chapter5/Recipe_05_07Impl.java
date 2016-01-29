package com.example.chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apovarkov on 29.01.16.
 */
public class Recipe_05_07Impl implements Recipe_05_07 {
    private List<String> skills;

    @Override
    public List<String> getSkills() {
        return skills;
    }

    @Override
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public void addSkill(String skill) {
        if(skills == null) {
            skills = new ArrayList<String>();
        }

        skills.add(skill);
    }
}
