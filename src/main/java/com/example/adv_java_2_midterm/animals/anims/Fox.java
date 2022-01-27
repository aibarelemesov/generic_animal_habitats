package com.example.adv_java_2_midterm.animals.anims;

import com.example.adv_java_2_midterm.animals.Animal;
import com.example.adv_java_2_midterm.movable.Walkable;

public class Fox extends Animal implements Walkable {
    @Override
    public int getComfortableSpace() {
        return 3;
    }

    @Override
    public String getName() {
        return "Fox";
    }
}
