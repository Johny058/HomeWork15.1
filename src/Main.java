
public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Gryffendor("Гарри", "Поттер", 100, 99, 90,
                        88, 92),
                new Gryffendor("Гермиона", "Грейнджер", 75, 66, 88,
                        77, 87),
                new Gryffendor("Рон", "Уизли", 70, 60, 77,
                        66, 76),
                new Slytherin("Драко", "Малфой", 75, 71, 50,
                        60, 33, 44, 20),
                new Slytherin("Грехан", "Мюнтегю", 65, 60, 13,
                        22, 44, 21, 11),
                new Slytherin("Грегори", "Гоил", 71, 62, 11,
                        22, 17, 19, 13),
                new Hufflepuff("Захария", "Смит", 72, 63, 22,
                        17, 33),
                new Hufflepuff("Седриг", "Диггори", 76, 70, 44,
                        35, 65),
                new Hufflepuff("Джастин", "Финч-Флетчли", 60, 55, 31,
                        17, 11),
                new Ravenclaw("Джоу", "Чанг", 55, 72, 13,
                        21, 42, 16),
                new Ravenclaw("Падма", "Патил", 58, 55, 18,
                        21, 15, 22),
                new Ravenclaw("Маркус", "Бэлби", 62, 60, 9,
                        33, 26, 18),
        };
        for (int i = 0; i < hogwarts.length; i++) {
            for (int j = i + 1; j < hogwarts.length - 1; j++) {
                hogwarts[i].printTheBestStudent(hogwarts[j]);
            }
        }


        Gryffendor Garry = (Gryffendor) hogwarts[0];
        Gryffendor Germyona = (Gryffendor) hogwarts[1];
        Garry.printTheBestStudent(Germyona);

        Slytherin Drago = (Slytherin) hogwarts[3];
        Slytherin Grehan = (Slytherin) hogwarts[4];
        Drago.printTheBestStudent(Grehan);

        Hufflepuff Zaharia = (Hufflepuff) hogwarts[6];
        Hufflepuff Sedrig = (Hufflepuff) hogwarts[7];
        Zaharia.printTheBestStudent(Sedrig);

        Ravenclaw Djoy = (Ravenclaw) hogwarts[9];
        Ravenclaw Padma = (Ravenclaw) hogwarts[10];
        Djoy.printTheBestStudent(Padma);
    }
}