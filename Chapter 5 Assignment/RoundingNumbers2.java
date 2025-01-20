import java.util.Scanner;

public class RoundingNumbers2 {
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to round and 'exit' to quit:");

        while (true) {
            System.out.print("Enter a number: ");

            if (scanner.hasNext("exit")) {
                break;
            }

            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();

                double roundedToInteger = roundToInteger(number);
                double roundedToTenths = roundToTenths(number);
                double roundedToHundredths = roundToHundredths(number);
                double roundedToThousandths = roundToThousandths(number);

                System.out.printf("Original number: %.4f%n", number);
                System.out.printf("Rounded to nearest integer: %.0f%n", roundedToInteger);
                System.out.printf("Rounded to nearest tenth: %.1f%n", roundedToTenths);
                System.out.printf("Rounded to nearest hundredth: %.2f%n", roundedToHundredths);
                System.out.printf("Rounded to nearest thousandth: %.3f%n", roundedToThousandths);

            } else {
                System.out.println("Invalid input. Please enter a valid number or 'exit' to quit.");
            }
        }
    }
}