package country;

import java.security.PublicKey;
import java.util.Arrays;

public class City {
    private String name;
    private int population;
    private Community[] communities;

    public City(String name, int population, Community[] communities) {
        this.name = name;
        this.population = population;
        this.communities = communities;
    }
    public City(String name, int population){
        this(name, population, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Community[] getCommunities() {
        return communities;
    }

    public void setCommunities(Community[] communities) {
        this.communities = communities;
    }

    @Override
    public String toString() {
        return "City{" +
                "name= '" + name + '\'' +
                ", population =" + population +
                ", communities = " + Arrays.toString(communities) +
                '}';
    }

    public static void main(String[] args) {
        Citizen[] citizens = {
                new Citizen("Benjamine Linus", 40, "male")
        };
        Community[] communities = {
                new Community("Others", citizens)
        };
        City city = new City("Los Angeles", 3800000, communities);
        System.out.println(city.getName());
    }
}

