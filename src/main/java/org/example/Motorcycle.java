package org.example;

public class Motorcycle {
    private String brand;
    private int ccSize;

    public Motorcycle(String brand, int ccSize) {
        this.brand = brand;
        this.ccSize = ccSize;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand = '" + brand + '\'' +
                ", ccSize = " + ccSize +
                '}';
    }

    public static void main(String[] args) {
        Motorcycle honda = new Motorcycle("Honda", 250);
        Motorcycle bmw = new Motorcycle("BMW", 1250);
        System.out.println(honda);
        System.out.println(bmw);
    }
}
