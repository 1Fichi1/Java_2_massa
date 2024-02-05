import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш текущий вес в килограммах:");
        double weight = scanner.nextDouble();

        System.out.println("Введите ваш рост в метрах:");
        double height = scanner.nextDouble();

        System.out.println("Введите ваш возраст:");
        int age = scanner.nextInt();

        double imt = weight / (height * height);

        double idealweight = 24.9 * height * height;

        double norma;
        if (age < 18) {
            System.out.println("Возраст должен быть 18 лет или старше.");
            return;
        } else if ( age >= 18 && age <= 30) {
            norma = 88.362 + (13.397 * weight) + (4.799 * height * 100) - (5.677 * age);
        } else {
            norma = 447.593 + (9.247 * weight) + (3.098 * height * 100) - (4.330 * age);
        }
        
        if (imt > 24.9) {
            double weightrek = weight - idealweight;
            double dailyCalories = norma - 500;

            System.out.println("Рекомендуется снизить вес для достижения идеального веса.");
            System.out.println("Идеальный вес: " + idealweight + " кг.");
            System.out.println("Необходимо сбросить: " + weightrek + " кг.");
            System.out.println("Рекомендуемый дневной прием калорий: " + dailyCalories);
        } else if (imt < 18.5) {
            double weightnabor= idealweight - weight;
            double calday = norma + 500;

            System.out.println("Рекомендуется увеличить потребление пищи для набора веса.");
            System.out.println("Идеальный вес: " + idealweight + " кг.");
            System.out.println("Необходимо набрать: " + weightnabor + " кг.");
            System.out.println("Рекомендуемый дневной прием калорий: " + calday);
        } else {
            double calday = norma;

            System.out.println("Ваш вес находится в пределах нормы.");
            System.out.println("Идеальный вес: " + idealweight + " кг.");
            System.out.println("Рекомендуемый дневной прием калорий: " + calday);
        }
    }
}
