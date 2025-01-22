import java.util.Scanner;

public class ArrayManipulation{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] number = new int[5];
		
		int sum = 0;
		
		for(int i = 0; i < 5; i++){
			System.out.print("Enter number: ");
			number[i] = scan.nextInt();

			sum += number[i];
		}
		System.out.printf("The total of the numbers entered is %d", sum);
	}
}