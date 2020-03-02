package com.improving;

import com.improving.animals.Cat;
import com.improving.animals.Dog;
import com.improving.taxonomy.Species;

import java.util.ArrayList;

public class Animals {
    ArrayList<Species> animals = new ArrayList<>();

    public void createAnimals(){
        Species dog = new Dog("Jeff", 2);
        Species dog2 = new Dog("Abby", 5);
        Species cat1 = new Cat("Blanca", 1);
        Species cat2 = new Cat("Gato", 2);
        animals.add(dog);
        animals.add(dog2);
        animals.add(cat1);
        animals.add(cat2);
    }
}
