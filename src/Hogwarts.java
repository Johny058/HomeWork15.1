public class Hogwarts {
    protected final String name;
    protected final String lastName;

    private final int witchcraft;  // колдовство
    private final int transgression;  // трансгесирование

    public Hogwarts(String name, String lastName, int witchcraft, int transgression) {
        this.name = name;
        this.lastName = lastName;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public void printTheBestStudent(Hogwarts hogwarts) {
        if (witchcraft + transgression > hogwarts.witchcraft + hogwarts.transgression) {
            System.out.println(name + " " + lastName + " сильнейший маг в Хогвартсе.");
        } else {
            System.out.println(hogwarts.getName() + " " + hogwarts.getLastName() + " сильнейший маг в Хогвартсе.");
        }
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", witchcraft=" + witchcraft +
                ", transgression=" + transgression +
                '}';
    }
}

