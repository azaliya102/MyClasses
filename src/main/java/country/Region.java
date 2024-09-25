package country;

import java.util.Arrays;

public class Region {
    private String name;
    private City[] cities;
    private int area;

    public Region(String name, City[] cities, int area) {
        this.name = name;
        this.cities = cities;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", cities=" + Arrays.toString(cities) +
                ", area=" + area +
                '}';
    }

    public static void main(String[] args) {
        Pet[] animals = {
                new Pet("budgie", "Sean"),
                new Pet("cat", "Seamus")
        };
        Citizen[] laCitizens = {
                new Citizen("Benjamine Linus", 40, "male")
        };
        Community[] laCommunities = {
                new Community("Others", laCitizens)
        };

        Citizen[] saCitizens = {
                new Citizen("Sean Stevens", 20, "male")
        };
        Community[] saCommunities = {
                new Community("Bird's paradise", saCitizens)
        };

        City[] cities = {
                new City("Los Angeles", 3800000, laCommunities),
                new City("Sacramento", 528000, saCommunities)
        };

        Region california = new Region("California", cities, 423970);
        System.out.println(california.getName());
    }
}

