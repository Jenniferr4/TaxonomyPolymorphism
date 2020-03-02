package com.improving.animals;

import com.improving.taxonomy.Species;

public class Dog extends Species {
    String name;
    int age;

    public Dog(String name, int age) {
        super("Canidae", "Canis", "Canis Familiaris");
        this.name = name;
        this.age = age;
    }

    public void description(){
        System.out.println("My name is " + getName() +" & I'm " + getAge()+".");
        System.out.println("Species: " + super.getSpeciesName() +
                "\nGenus: " + super.getGenusName()+
                "\nFamily:"+ super.getFamilyName());
    }

    @Override
    public String speak() {
        return "Woof! Woof! I'm a DOG. ";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
