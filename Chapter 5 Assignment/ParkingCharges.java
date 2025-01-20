import java.util.Scanner;

public class ParkingCharges {
    public static double calculateCharges(double hours) {
        double charge = 2.00; // Minimum charge for up to 3 hours

        if (hours > 3) {
            charge += 0.50 * (hours - 3); 
        }

        return Math.min(charge, 10.00); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0.0;

        System.out.println("Parking Garage Charges");

        while (true) {
            System.out.print("Enter hours parked or 0 to quit: ");
            double hours = scanner.nextDouble();

            if (hours == 0) {
                break; // Exit the loop if user enters 0
            }

            if (hours <= 0 || hours > 24) {
                System.out.println("Invalid input. Please enter a value between 1 and 24.");
                continue;
            }

            double charge = calculateCharges(hours);
            totalReceipts += charge;

            System.out.printf("Hours parked: %.2f, Charge: $%.2f%n", hours, charge);
        }

        System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
    }
}