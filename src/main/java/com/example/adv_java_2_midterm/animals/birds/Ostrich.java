package com.example.adv_java_2_midterm.animals.birds;

import com.example.adv_java_2_midterm.movable.Walkable;

public class Ostrich extends Bird implements Walkable {

    public String getName() {
        return "Ostrich";
    }

    @Override
    public int getComfortableSpace() {
        return 4;
    }
}
