package com.example.adv_java_2_midterm.animals.birds;

import com.example.adv_java_2_midterm.movable.Flyable;

public class Sparrow extends Bird implements Flyable {
    public String getName() {
        return "Sparrow";
    }

    @Override
    public int getComfortableSpace() {
        return 1;
    }
}
