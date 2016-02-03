package com.example.chapter5;

import java.io.*;

/**
 * Created by apovarkov on 03.02.16.
 */
public class Recipe_05_10 implements Cloneable, Serializable {
    private String name;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Object clone() {
        Object clone = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(baos);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(bais);
            clone = objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public Object shallowCopyClone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Recipe_05_10 that = (Recipe_05_10) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return city != null ? city.equals(that.city) : that.city == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
