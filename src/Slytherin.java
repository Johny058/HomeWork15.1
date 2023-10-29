public class Slytherin extends Hogwarts {
    private final int cunning;  // хитрость
    private final int determination;  // решительность
    private final int ambition;   // амбиционизм
    private final int resourcefulness;  // находчивость
    private final int thirstForPower;  // жажда власти

    public Slytherin(String name, String lastName, int witchcraft,
                     int transgression, int cunning, int determination,
                     int ambition, int resourcefulness, int thirstForPower) {
        super(name, lastName, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public static void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Маг Слизерина - " + slytherin.getName() + " " + slytherin.getLastName() +
                    " Уровень колдовства: " + slytherin.getWitchcraft() +
                    " Растояние трансгрессии: " + slytherin.getTransgression() +
                    " Хитрость - " + slytherin.getCunning() + " Решительность - " +
                    slytherin.getDetermination() + "Амбиционизм -" + slytherin.getAmbition() +
                    " Находчивость - " + slytherin.getResourcefulness() + " Жажда власти - " +
                    slytherin.getThirstForPower());
        }
    }

    public void printTheBestStudent(Slytherin slytherin) {
        if (cunning + determination + ambition + resourcefulness + thirstForPower > slytherin.cunning +
                slytherin.determination + slytherin.ambition + slytherin.resourcefulness +
                slytherin.thirstForPower) {
            System.out.println(name + " " + lastName + " лучший Слизеренец, чем " + slytherin.getName() +
                    " " + slytherin.getLastName());
        } else {
            System.out.println(slytherin.getName() + " " + slytherin.getLastName() + " лучший " +
                    "Слизеренец, чем " + name + lastName);
        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }
}
