package country;

import java.util.Arrays;

public class Community {
    private String name;
    private Citizen[] citizens;

    public Community(String name, Citizen[] citizens) {
        this.name = name;
        this.citizens = citizens;
    }

    public Citizen[] getCitizens() {
        return citizens;
    }

    public void setCitizens(Citizen[] citizens) {
        this.citizens = citizens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Community{" +
                "name='" + name + '\'' +
                ", citizens=" + Arrays.toString(citizens) +
                '}';
    }

    public static void main(String[] args) {
        Citizen[] citizens = {
                new Citizen("Claire Littleton", 28, "female"),
                new Citizen("Kate Austen", 35, "female")
        };
        Community community = new Community("Weird island people", citizens);
        System.out.println(community.getName());
    }
}

