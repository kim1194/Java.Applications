import java.util.Scanner;

public class SetinelLoop{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter numbers to sum(Enter-1 to stop): ");
		
		int sum = 0;
		int number;
		
		while(true){
			System.out.print("Enter number: ");
			number = scan.nextInt();
		
			if (number == -1) {
				break;
			}
			
			sum += number;
			
		}
		
		System.out.printf("The total sum is: %d", sum);
	}
}