package com.example.adv_java_2_midterm;

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
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AdvJava2MidtermApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AdvJava2MidtermApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Tiger tiger = new Tiger();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Turtle turtle = new Turtle();

        Pike pike = new Pike();
        Shark shark = new Shark();

        Ostrich ostrich = new Ostrich();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();
        Crow crow = new Crow();

        List<Habitat<?>> list = new ArrayList<>();

        Cage<Tiger> tigerCage = new Cage<>(20, "Cage for tiger");

        Cage<Wolf> wolfCage = new Cage<>(20, "Cage for wolf");

        Cell<Flyable> cellForFlyableBirds = new Cell<>(20,"Cell for flyable birds");

        Aquarium<Fish> fishAquarium = new Aquarium<>(20, "Aquarium for any fish");

        Aquarium<Turtle> turtleAquarium = new Aquarium<>(20, "Aquarium for turtle");

        Aquarium<Swimmable> aquariumForAnyWaterhabitants = new Aquarium<>(20, "Aquarium for any waterhabitants");

        System.out.println("-----------");
    }
}
