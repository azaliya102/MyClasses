package org.example;

import java.util.Arrays;

public class Room {
    private Bookshelf[] shelves;
    private TV[] tvs;

    public Room(Bookshelf[] shelves, TV[] tvs) {
        this.shelves = shelves;
        this.tvs = tvs;
    }

    public Room(Bookshelf[] shelves) {
        this(shelves, null);
    }

    public Bookshelf[] getShelves() {
        return shelves;
    }

    public void setShelves(Bookshelf[] shelves) {
        this.shelves = shelves;
    }

    public TV[] getTvs() {
        return tvs;
    }

    public void setTvs(TV[] tvs) {
        this.tvs = tvs;
    }

    @Override
    public String toString() {
        return "Room{" +
                "shelves = " + Arrays.toString(shelves) +
                ", TVs = " + Arrays.toString(tvs) +
                '}';
    }

    public static void main(String[] args) {

        Book[] books = {
                new Book("Scala book", 600),
                new Book("C++ book", 550),
        };

        Bookshelf[] bookshelves = {
                new Bookshelf(books, 40, 50, 30)
        };
        TV[] tvs = {
                new TV(45, "Samsung"),
                new TV(55, "LG")
        };
        Room sleeping = new Room(bookshelves);
        Room guestroom = new Room(bookshelves, tvs);
        System.out.println(sleeping);
        System.out.println(guestroom);
    }
}

