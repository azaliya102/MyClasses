package org.example;

import java.util.Arrays;

public class Garage {
    private Motorcycle[] motorcycles;

    public Garage(Motorcycle[] motorcycles) {
        this.motorcycles = motorcycles;
    }

    public Motorcycle[] getMotorcycles() {
        return motorcycles;
    }

    public void setMotorcycles(Motorcycle[] motorcycles) {
        if (motorcycles != null) { // to avoid accidentally passing null to the array :)
            this.motorcycles = motorcycles;
        }
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
        Garage myGarage = new Garage(motos);
        System.out.println(myGarage);
    }
}
