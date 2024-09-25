package country;

import java.util.Arrays;

public class Country {
    private String name;
    private Region[] regions;
    private String currency;
    private Religion religion;

    public Country(String name, Region[] regions, String currency, Religion religion) {
        this.name = name;
        this.regions = regions;
        this.currency = currency;
        this.religion = religion;
    }

    public Country(String name, Region[] regions, String currency) {
        this(name, regions, currency, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", regions=" + Arrays.toString(regions) +
                ", currency='" + currency + '\'' +
                ", religion=" + religion +
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
                new Community("Otherss", laCitizens)
        };

        Citizen[] saCitizens = {
                new Citizen("Sean Stevens", 20, "male")
        };
        Community[] saCommunities = {
                new Community("Bird's paradiso", saCitizens)
        };

        City[] cities = {
                new City("Los Angeles", 3800000, laCommunities),
                new City("Sacramento", 528000, saCommunities)
        };

        Region california = new Region("California", cities, 423970);

        Country usa = new Country("United States", new Region[]{california}, "USD");
        System.out.println(california.getName());
        System.out.println(usa.getName());
    }
}
