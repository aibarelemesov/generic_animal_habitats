package com.example.adv_java_2_midterm.animals.fishes;

import com.example.adv_java_2_midterm.movable.Swimmable;

public class Pike extends Fish implements Swimmable {
    @Override
    public int getComfortableSpace() {
        return 2;
    }

    @Override
    public String getName() {
        return "Pike";
    }
}
