package org.example;

public class Book {
    String name;
    int pageCount;

    Book(String name, int pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name = '" + name + '\'' +
                ", pageCount = " + pageCount +
                '}';
    }

    public static void main(String[] args) {
        Book war_and_peace = new Book("war and peace", 500);
        Book javaBook = new Book("Java Book", 600);
        Book pythonBook = new Book("python book", 550);
        System.out.println(war_and_peace);
        System.out.println(javaBook);
        System.out.println(pythonBook);
    }
}

