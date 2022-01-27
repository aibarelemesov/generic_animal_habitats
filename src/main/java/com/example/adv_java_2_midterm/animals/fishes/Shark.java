package com.example.adv_java_2_midterm.animals.fishes;

import com.example.adv_java_2_midterm.movable.Swimmable;

public class Shark extends Fish implements Swimmable {
    @Override
    public int getComfortableSpace() {
        return 4;
    }

    @Override
    public String getName() {
        return "Shark";
    }
}
