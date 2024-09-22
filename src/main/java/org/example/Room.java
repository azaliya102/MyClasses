package org.example;

import java.util.Arrays;

public class Room {
    Bookshelf[] shelves;
    TV[] TVs;
    Room(Bookshelf[] shelves, TV[] TVs){
        this.shelves = shelves;
        this.TVs = TVs;
    }
    Room(Bookshelf[] shelves){
        this.shelves = shelves;
    }

    @Override
    public String toString() {
        return "Room{" +
                "shelves = " + Arrays.toString(shelves) +
                ", TVs = " + Arrays.toString(TVs) +
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
        TV[] TVs = {
                new TV(45, "Samsung"),
                new TV(55, "LG")
        };
        Room sleeping = new Room(bookshelves);
        Room guestroom = new Room(bookshelves, TVs);
        System.out.println(sleeping);
        System.out.println(guestroom);
    }
}

