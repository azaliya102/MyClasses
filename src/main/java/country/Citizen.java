package country;

import java.util.Arrays;

public class Citizen {
    private String name;
    private int age;
    private String sex;
    private Pet[] pets;

    public Citizen(String name, int age, String sex, Pet[] pets) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.pets = pets;
    }

    public Citizen(String name, int age, String sex) {
        this(name, age, sex, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Citizen{" + "name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + ", pets=" + Arrays.toString(pets) + '}';
    }

    public static void main(String[] args) {
        Pet[] animals = {new Pet("budgie", "Sean"), new Pet("cat", "Seamus")};
        Citizen john = new Citizen("John Locke", 55, "male");
        Citizen jack = new Citizen("Jack Shepherd", 40, "male", animals);
        Citizen seanusBirdie = new Citizen("Sean Stevens", 20, "male");

        System.out.println(john);
        System.out.println(jack);
        john.setName("black smoke");
        System.out.println(john.getName());
        System.out.println(seanusBirdie.getName());
    }
}


