import java.util.Scanner;
import java.util.Random;

public class ClassworkOnRn{
	public static void main(String[] args){
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a maximum number");
		int maxNum = input.nextInt();
		
		if(maxNum == 0){
			System.out.println("maximum number must be greater than 0");
		}
		else{
			int randomNum = random.nextInt(maxNum) + 1;
			System.out.printf("Random number from 0 - %d is: %d%n",maxNum, randomNum);
		}
	}
}