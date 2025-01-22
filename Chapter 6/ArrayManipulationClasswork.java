import java.util.Scanner;

public class ArrayManipulationClasswork{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] number = new int[10];
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.print("Enter number: ");
			number[i] = scan.nextInt();

		}
		for(int i = 1; i <= 5; i++){
			sum1 += number[i];
		}
		
		for(int i = 6; i <= 8; i++){
			sum2 += number[i];
		}
		int result = sum1 - sum2;
		System.out.printf("The sum of the second to sixth is %d and the total after substracting is %d", sum1, result);
	}
}