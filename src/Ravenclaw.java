public class Ravenclaw extends Hogwarts {
    private final int intelligence;  // ум
    private final int wisdom;  // мудрость
    private final int wit;  // остроумие
    private final int creativity;  //творчество

    public Ravenclaw(String name, String lastName, int witchcraft, int transgression,
                     int intelligence, int wisdom, int wit, int creativity) {
        super(name, lastName, witchcraft, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public static void print(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Маг Когтеврана - " + ravenclaw.getName() + " " + ravenclaw.getLastName() +
                    " Уровень колдовства: " + ravenclaw.getWitchcraft() +
                    " Растояние трансгрессии: " + ravenclaw.getTransgression() + " Мудрость - " +
                    ravenclaw.getWisdom() + " Остроумие - " + ravenclaw.getWit() +
                    " Творчество - " + ravenclaw.getCreativity());
        }
    }

    public void printTheBestStudent(Ravenclaw ravenclaw) {
        if (intelligence + wisdom + wit + +creativity > ravenclaw.intelligence +
                ravenclaw.wisdom + ravenclaw.wit + ravenclaw.creativity) {
            System.out.println(name + " " + lastName + " лучший Когтевранец, чем " + ravenclaw.getName() +
                    " " + ravenclaw.getLastName());
        } else {
            System.out.println(ravenclaw.getName() + " " + ravenclaw.getLastName() + " лучший " +
                    "Когтевранец, чем " + name + lastName);
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}
