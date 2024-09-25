package country;

public class Religion {
    private String name;

    public Religion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Religion{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Religion goodReligion = new Religion("Christianity");
        Religion badReligion = new Religion("Islam");
        System.out.println(goodReligion.getName());
        System.out.println(badReligion.getName());

    }
}

