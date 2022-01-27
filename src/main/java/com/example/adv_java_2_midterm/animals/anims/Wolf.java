package com.example.adv_java_2_midterm.animals.anims;

import com.example.adv_java_2_midterm.animals.Animal;
import com.example.adv_java_2_midterm.movable.Walkable;

public class Wolf extends Animal implements Walkable {
    public String getName() {
        return "Wolf";
    }

    @Override
    public int getComfortableSpace() {
        return 3;
    }
}
