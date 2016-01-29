package com.example.chapter5;

/**
 * Created by apovarkov on 29.01.16.
 */
public class MyBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private boolean married;

    private MyBuilder(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.married = builder.married;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private boolean married;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder married(boolean married) {
            this.married = married;
            return this;
        }

        public MyBuilder build() {
            return new MyBuilder(this);
        }
    }
}
