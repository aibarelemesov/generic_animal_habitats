package com.example.adv_java_2_midterm.habitats;

import com.example.adv_java_2_midterm.animals.birds.Penguin;
import com.example.adv_java_2_midterm.movable.Swimmable;

public class Aquarium<T extends Swimmable> extends Habitat<T>{

    public Aquarium(int size, String name) {
        super(size, name);
    }

    @Override
    public void addAnimals(T animal) throws Exception {
        if (animal instanceof Penguin) throw new Exception("Penguin cannot be placed in aquarium");
        super.addAnimals(animal);
    }
}
