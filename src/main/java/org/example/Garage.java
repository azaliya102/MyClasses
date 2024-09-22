package org.example;

import java.lang.module.ModuleReader;
import java.util.Arrays;

public class Garage {
    Motorcycle[] motorcycles;
    Garage(Motorcycle[] motorcycles){
        this.motorcycles = motorcycles;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "motorcycles = " + Arrays.toString(motorcycles) +
                '}';
    }

    public static void main(String[] args) {
        Motorcycle[] motos = {
                new Motorcycle("Honda", 750),
                new Motorcycle("BMW", 1250)
        };
        Garage mygarage = new Garage(motos);
        System.out.println(mygarage);
    }
}
