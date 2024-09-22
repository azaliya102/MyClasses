package org.example;

import java.util.Arrays;

public class Person {
    String name;
    String lastname;
    House[] houses;

    Person(String name, String lastname, House[] houses) {
        this.name = name;
        this.lastname = lastname;
        this.houses = houses;
    }

    Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = '" + name + '\'' +
                ", lastname = '" + lastname + '\'' +
                ", houses = " + Arrays.toString(houses) +
                '}';
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("War and Peace", 500),
                new Book("Java Book", 600),
                new Book("Python Book", 550)
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
                new Motorcycle("Honda", 750),
                new Motorcycle("BMW", 1250)
        };
        Garage[] mygarage = {
                new Garage(motos)
        };
        House[] yourhouse = {
                new House(rooms, mygarage)
        };

        Person me = new Person("Azaliya", "Muratova");
        Person you = new Person("Pavel", "Orekhov", yourhouse);

        System.out.println(me);
        System.out.println(you);
    }
}
