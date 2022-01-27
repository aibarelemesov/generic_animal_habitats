package com.example.adv_java_2_midterm.animals.birds;

import com.example.adv_java_2_midterm.movable.Swimmable;
import com.example.adv_java_2_midterm.movable.Walkable;

public class Penguin extends Bird implements Swimmable, Walkable {
    public String getName() {
        return "Penguin";
    }

    @Override
    public int getComfortableSpace() {
        return 3;
    }
}
