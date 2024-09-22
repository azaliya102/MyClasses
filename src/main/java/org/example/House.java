package org.example;

import java.util.Arrays;

public class House {
    private Room[] rooms;
    private Garage[] garages;

    public House(Room[] rooms, Garage[] garages) {
        this.rooms = rooms;
        this.garages = garages;
    }

    public House(Room[] rooms) {
        this(rooms, null);
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms = " + Arrays.toString(rooms) +
                ", garages = " + Arrays.toString(garages) +
                '}';
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("war and peace", 500),
                new Book("Java Book", 600),
                new Book("python book", 550)
        };
        TV[] tvs = {
                new TV(45, "Samsung"),
                new TV(50, "LG"),
                new TV(40, "Xiaomi")
        };
        Bookshelf[] bookshelves = new Bookshelf[]{
                new Bookshelf(books, 40, 30, 55)
        };
        Room[] rooms = {
                new Room(bookshelves, tvs)
        };
        Motorcycle[] motos = {
                new Motorcycle("honda", 750),
                new Motorcycle("BMW", 1250)
        };
        Garage[] mygarage = {
                new Garage(motos)
        };
        House myhouse = new House(rooms, mygarage);
        House yourhouse = new House(rooms);
        System.out.println(myhouse);
        System.out.println(yourhouse);
    }
}
