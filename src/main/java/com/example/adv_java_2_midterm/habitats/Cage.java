package com.example.adv_java_2_midterm.habitats;

import com.example.adv_java_2_midterm.movable.Walkable;

public class Cage<T extends Walkable> extends Habitat<T>{
    public Cage(int size, String name) {
        super(size, name);
    }
}
