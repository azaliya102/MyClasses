package org.example;

import java.util.Arrays;

public class Bookshelf {
    Book[] books;
    int width;
    int height;
    int depth;

    Bookshelf(Book[] books, int width, int height, int depth) {
        this.books = books;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Bookshelf{ " +
                "books   = " + Arrays.toString(books) +
                ", width = " + width +
                ", height = " + height +
                ", depth = " + depth +
                '}';
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("Java book", 600),
                new Book("Python book", 550),
                new Book("Kotlin book", 400)
        };
        Bookshelf biggest = new Bookshelf(books, 55, 30, 45);
        System.out.println(biggest);
    }
}
