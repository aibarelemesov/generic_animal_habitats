package com.example.adv_java_2_midterm.animals.anims;

import com.example.adv_java_2_midterm.animals.Animal;
import com.example.adv_java_2_midterm.movable.Swimmable;
import com.example.adv_java_2_midterm.movable.Walkable;

public class Turtle extends Animal implements Walkable, Swimmable {
    public String getName() {
        return "Turtle";
    }

    @Override
    public int getComfortableSpace() {
        return 2;
    }
}