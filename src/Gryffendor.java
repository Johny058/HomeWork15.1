public class Gryffendor extends Hogwarts {
    private final int nobility;  // благородство
    private final int honour;  //честь
    private final int bravery;  // храбрость

    public Gryffendor(String name, String lastName, int witchcraft,
                      int transgression, int nobility, int honour, int bravery) {
        super(name, lastName, witchcraft, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }


    public static void print(Gryffendor[] gryffendors) {
        for (int i = 0; i < gryffendors.length; i++) {
            Gryffendor gryffendor = gryffendors[i];
            System.out.println("Маг Гриффендора - " + gryffendor.getName() + " " + gryffendor.getLastName() +
                    " Уровень колдовства: " + gryffendor.getWitchcraft() +
                    " Растояние трансгрессии: " + gryffendor.getTransgression() + "Благородство - "
                    + gryffendor.getNobility() + " Честь - " + gryffendor.getHonour() + " Храбрость - "
                    + gryffendor.getBravery());
        }
    }

    public void printTheBestStudent(Gryffendor gryffendor) {

        if (nobility + honour + bravery > gryffendor.nobility + gryffendor.honour + gryffendor.bravery) {
            System.out.println(name + " " + lastName + " лучший Гриффиндорец, чем " + gryffendor.getName() +
                    " " + gryffendor.getLastName());
        } else {
            System.out.println(gryffendor.getName() + " " + gryffendor.getLastName() + " лучший " +
                    "Гриффиндорец, чем " + name + lastName);
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Gryffendor{" +
                "nobility=" + nobility +
                ", honour=" + honour +
                ", bravery=" + bravery +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
