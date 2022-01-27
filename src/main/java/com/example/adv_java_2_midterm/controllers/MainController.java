package com.example.adv_java_2_midterm.controllers;

import com.example.adv_java_2_midterm.animals.Animal;
import com.example.adv_java_2_midterm.animals.anims.Fox;
import com.example.adv_java_2_midterm.animals.anims.Tiger;
import com.example.adv_java_2_midterm.animals.anims.Turtle;
import com.example.adv_java_2_midterm.animals.anims.Wolf;
import com.example.adv_java_2_midterm.animals.birds.Crow;
import com.example.adv_java_2_midterm.animals.birds.Ostrich;
import com.example.adv_java_2_midterm.animals.birds.Penguin;
import com.example.adv_java_2_midterm.animals.birds.Sparrow;
import com.example.adv_java_2_midterm.animals.fishes.Fish;
import com.example.adv_java_2_midterm.animals.fishes.Pike;
import com.example.adv_java_2_midterm.animals.fishes.Shark;
import com.example.adv_java_2_midterm.habitats.Aquarium;
import com.example.adv_java_2_midterm.habitats.Cage;
import com.example.adv_java_2_midterm.habitats.Cell;
import com.example.adv_java_2_midterm.habitats.Habitat;
import com.example.adv_java_2_midterm.movable.Flyable;
import com.example.adv_java_2_midterm.movable.Swimmable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class MainController {
    private final List<Habitat<?>> habitats = new ArrayList<>();
    private final List<Animal> animals = new ArrayList<>();

    public MainController() {
        animals.add(new Tiger());
        animals.add(new Wolf());
        animals.add(new Turtle());
        animals.add(new Fox());
        animals.add(new Shark());
        animals.add(new Pike());
        animals.add(new Sparrow());
        animals.add(new Ostrich());
        animals.add(new Penguin());
        animals.add(new Crow());
    }


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("habitats",habitats);
        return "index";
    }

    @GetMapping("/habitat")
    public String addHabitat() {
        return "habitat";
    }

    @GetMapping("/animal/{index}")
    public String addAnimalToHabitat(@PathVariable UUID index, Model model) {
        model.addAttribute("animals",animals);
        model.addAttribute("index", index);
        return "animal";
    }

    @PostMapping("/addHabitat")
    public ModelAndView addHabitat(@RequestParam String type, @RequestParam int size) {
        switch (type) {
            case "Cage for tiger":
                Cage<Tiger> tigerCage;
                tigerCage = new Cage<>(size,type);
                habitats.add(tigerCage);
                break;
            case "Cage for wolf":
                Cage<Wolf> wolfCage;
                wolfCage = new Cage<>(size,type);
                habitats.add(wolfCage);
                break;
            case "Cell for flyable bird":
                Cell<Flyable> cellForFlyableBirds;
                cellForFlyableBirds = new Cell<>(size,type);
                habitats.add(cellForFlyableBirds);
                break;
            case "Aquarium for fishes":
                Aquarium<Fish> fishAquarium;
                fishAquarium = new Aquarium<>(size,type);
                habitats.add(fishAquarium);
                break;
            case "Aquarium for turtles":
                Aquarium<Turtle> turtleAquarium;
                turtleAquarium = new Aquarium<>(size,type);
                habitats.add(turtleAquarium);
                break;
            case "Aquarium for any water habitant":
                Aquarium<Swimmable> aquariumForAnyWaterhabitants;
                aquariumForAnyWaterhabitants = new Aquarium<>(size,type);
                habitats.add(aquariumForAnyWaterhabitants);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return new ModelAndView("redirect:/");
    }

    @PostMapping("/addAnimalToHabitat/{index}")
    public ModelAndView addToHabitat(@PathVariable UUID index, @RequestParam String animalType) throws Exception {
        Animal anim = null;

        for (Animal animal: animals) {
            if(animal.getName().equals(animalType))
                anim = animal;
        }

        int i = -1;

        for (Habitat<?> habitat :habitats) {
            if(habitat.getId().equals(index))
                i = habitats.indexOf(habitat);
        }

        switch (habitats.get(i).getName()) {
            case "Cage for tiger":
                Cage<Tiger> tigerCage = (Cage<Tiger>) habitats.get(i);
                tigerCage.addAnimals((Tiger) anim);
                break;
            case "Cage for wolf":
                Cage<Wolf> wolfCage = (Cage<Wolf>) habitats.get(i);
                wolfCage.addAnimals((Wolf) anim);
                break;
            case "Cell for flyable bird":
                Cell<Flyable> cellForFlyableBirds = (Cell<Flyable>) habitats.get(i);
                cellForFlyableBirds.addAnimals((Flyable) anim);
                break;
            case "Aquarium for fishes":
                Aquarium<Fish> fishAquarium = (Aquarium<Fish>) habitats.get(i);
                fishAquarium.addAnimals((Fish) anim);
                break;
            case "Aquarium for turtles":
                Aquarium<Turtle> turtleAquarium = (Aquarium<Turtle>) habitats.get(i);
                turtleAquarium.addAnimals((Turtle) anim);
                break;
            case "Aquarium for any water habitant":
                Aquarium<Swimmable> aquariumForAnyWaterhabitants = (Aquarium<Swimmable>) habitats.get(i);
                aquariumForAnyWaterhabitants.addAnimals((Swimmable) anim);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + animalType);
        }
        return new ModelAndView("redirect:/");
    }
}
