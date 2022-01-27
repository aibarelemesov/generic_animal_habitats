package com.example.adv_java_2_midterm.habitats;

import com.example.adv_java_2_midterm.movable.Flyable;

public class Cell<T extends Flyable> extends Habitat<T>{
    public Cell(int size, String name) {
        super(size, name);
    }
}
