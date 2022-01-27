package com.example.adv_java_2_midterm.habitats;

import com.example.adv_java_2_midterm.movable.Movable;

import java.util.*;

public abstract class Habitat <T extends Movable> {
    private final UUID id = UUID.randomUUID();
    private int size;
    public List<T> animals;
    private String name;

    public UUID getId() {
        return id;
    }

    public void addAnimals(T animal) throws Exception{
        if (animal.getComfortableSpace() > size) throw new Exception("Habitat is overloaded");
        animals.add(animal);
        size-= animal.getComfortableSpace();
    }

    public Habitat(int size, String name) {
        setSize(size);
        setName(name);
        animals = new ArrayList<>();
    }

    public Map<String, Integer> getAnimalsInfo(){
        Map<String, Integer> map = new HashMap<>();
        for (T anims: animals){
            map.put(anims.getName(),anims.getComfortableSpace());
        }
        return map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<T> getAnimals() {
        return animals;
    }

    public void setAnimals(List<T> animals) {
        this.animals = animals;
    }
}
