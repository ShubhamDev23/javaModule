import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}

