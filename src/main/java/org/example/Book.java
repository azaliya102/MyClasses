package org.example;

public class Book {
    private String name;
    private int pageCount;

    public Book(String name, int pageCount) {
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
        Book warAndPeace = new Book("War and Peace", 500);
        Book javaBook = new Book("Java Book", 600);
        Book pythonBook = new Book("Python book", 550);
        System.out.println(warAndPeace);
        System.out.println(javaBook);
        System.out.println(pythonBook);
    }
}

