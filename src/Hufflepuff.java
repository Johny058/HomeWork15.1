public class Hufflepuff extends Hogwarts {
    private final int diligence;  // трудолюбие
    private final int loyalty;  // верность
    private final int honesty;  // честность

    public Hufflepuff(String name, String lastName, int witchcraft,
                      int transgression, int diligence, int loyalty, int honesty) {
        super(name, lastName, witchcraft, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public static void print(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Маг Пуффендуя - " + hufflepuff.getName() + " " + hufflepuff.getLastName() +
                    " Уровень колдовства: " + hufflepuff.getWitchcraft() +
                    " Растояние трансгрессии: " + hufflepuff.getTransgression() + " Трудолюбие - " +
                    hufflepuff.getDiligence() + " Верность - " + hufflepuff.getLoyalty() +
                    " Честность - " + hufflepuff.getHonesty());
        }
    }

    public void printTheBestStudent(Hufflepuff hufflepuff) {
        if (diligence + loyalty + honesty > hufflepuff.diligence +
                hufflepuff.loyalty + hufflepuff.honesty) {
            System.out.println(name + " " + lastName + " лучший Пуффендуец, чем " + hufflepuff.getName() +
                    " " + hufflepuff.getLastName());
        } else {
            System.out.println(hufflepuff.getName() + " " + hufflepuff.getLastName() + " лучший " +
                    "Пуффендуец, чем " + name + lastName);
        }
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}