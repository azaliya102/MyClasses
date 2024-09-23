package org.example;

public class Motorcycle {
    private String brand;
    private int ccSize;

    public Motorcycle(String brand, int ccSize) {
        this.brand = brand;
        this.ccSize = ccSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCcSize() {
        return ccSize;
    }

    public void setCcSize(int ccSize) {
        if (ccSize > 0) {
            this.ccSize = ccSize;
        } else {
            System.out.println("Engine size must be positive!!!");
        }
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
        bmw.setCcSize(-300);
    }
}
