import java.util.Scanner;

public class RoundingNumbers {

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
                double rounded = Math.floor(number + 0.5);
                System.out.printf("Original number: %.2f, Rounded number: %.0f%n", number, rounded);
            } else {
                System.out.println("Invalid input. Please enter a valid number or 'exit' to quit.");
          
            }
        }
        System.out.println("Program terminated.");
    }
}