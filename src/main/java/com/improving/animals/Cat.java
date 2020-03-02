package com.improving.animals;

import com.improving.taxonomy.Species;

public class Cat extends Species {
    String name;
    int age;


    public Cat(String name, int age) {
        super("Felidae", "Felis", "Felis catus");
        this.name = name;
        this.age = age;
    }


    @Override
    public String speak() {
        return "Meooww, I'm a CAT" ;
    }

    @Override
    public void description() {
        System.out.println("My name is " + getName() + " & I'm " + getAge() + ".");
        System.out.println("Species: " + super.getSpeciesName() +
                "\nGenus: " + super.getGenusName() +
                "\nFamily:" + super.getFamilyName());
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
