package org.example;

import java.util.Arrays;

public class Person {
    private String name;
    private String lastname;
    private House[] houses;

    public Person(String name, String lastname, House[] houses) {
        this.name = name;
        this.lastname = lastname;
        this.houses = houses;
    }

    public Person(String name, String lastname) {
        this(name, lastname, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public House[] getHouses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
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
                new Motorcycle("honda", 750),
                new Motorcycle("bmw", 1250)
        };
        Garage[] mygarage = {
                new Garage(motos)
        };
        House[] yourhouse = {
                new House(rooms, mygarage)
        };

        Person me = new Person("Azalia", "Muratova");
        Person you = new Person("Pavel", "Orekhov", yourhouse);

        System.out.println(me);
        System.out.println(you);
    }
}
