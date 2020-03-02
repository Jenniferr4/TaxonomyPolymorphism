package com.improving;
import com.improving.animals.Dog;
import com.improving.taxonomy.Species;
import java.util.ArrayList;
import java.util.List;

public class Main {
    String breakLine = ("----------------------------");
    public String getBreakLine() {
        return breakLine;
    }


    public static void main(String[] args) {
        Main main = new Main();
        Animals animals = new Animals();
        animals.createAnimals();
        var line = main.breakLine;


        System.out.println("Good Morning! \n");

        for (Species x : animals.animals) {
            System.out.println(x.speak());
            x.description();
            System.out.println(line);
        }

    }



}

