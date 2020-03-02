package com.improving;
import com.improving.taxonomy.Species;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.createAnimals();
        String breakLine = ("----------------------------");

        for (Species x : animals.animals) {
            System.out.println(x.speak());
            x.description();
            System.out.println(breakLine);
        }

    }

}

