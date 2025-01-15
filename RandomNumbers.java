import java.util.Random;

public class RandomNumbers{
	public static void main(String[] args){
		Random random = new Random();
		
		//create a variable to store the random number generated.
		int randomNum = random.nextInt();
		
		//print your random number
		System.out.printf("Random number is %d%n", randomNum);
		
		//Generating a number within a range
		int randomNumInRange = random.nextInt(20) + 1;
		
		System.out.printf("Random number in range is %d%n", randomNumInRange);
		
		//Generating a float point number
		double floatPointNum = random.nextDouble();
		
		System.out.printf("Random float number is %f%n", floatPointNum);
		
		//Generating a float point number within a range
		double min = 10.0;
		double max = 20.0;
		double randomFloatPointInRange = min + (max-min)* random.nextDouble();
		
		System.out.printf("Random float number in range is %.2f%n", randomFloatPointInRange);
		
		//Generating a random boolean value
		boolean booleanValue = random.nextBoolean();
		
		System.out.printf("Random boolean value is %b%n", booleanValue);
	}
}