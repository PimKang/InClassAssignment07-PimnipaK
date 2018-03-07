package com.example.android.inclassassignment07_pimnipak;

import java.io.Serializable;

/**
 * Created by Admin on 3/6/18.
 */

public class Pupper implements Serializable {
    String name;
    int age;
    boolean goodBoi;

    public Pupper (String name, int age, boolean goodBoi) {
        this.name=name;
        this.age=age;
        this.goodBoi=goodBoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public boolean getGoodBoi() {
        return goodBoi;
    }

    public void setGoodBoi(boolean goodBoi) {
        this.goodBoi = goodBoi;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Good boi: " + goodBoi ;
    }
}