package com.example.adv_java_2_midterm.animals.birds;

import com.example.adv_java_2_midterm.movable.Flyable;

public class Crow extends Bird implements Flyable {
    public String getName() {
        return "Crow";
    }

    @Override
    public int getComfortableSpace() {
        return 2;
    }
}
