package com.example.adv_java_2_midterm.animals.anims;

import com.example.adv_java_2_midterm.animals.Animal;
import com.example.adv_java_2_midterm.movable.Walkable;

public class Tiger extends Animal implements Walkable {
    public String getName() {
        return "Tiger";
    }

    @Override
    public int getComfortableSpace() {
        return 4;
    }
}
