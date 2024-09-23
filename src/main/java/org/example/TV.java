package org.example;

public class TV {
    private int size;
    private String name;

    public TV(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TV{" +
                "size = " + size +
                ", name = '" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        TV samsung = new TV(45, "Samsung");
        TV lg = new TV(50, "LG");
        TV xiaomi = new TV(40, "Xiaomi");
        System.out.println(samsung);
        System.out.println(lg);
        System.out.println(xiaomi);
        System.out.println(xiaomi.getName());
    }
}
