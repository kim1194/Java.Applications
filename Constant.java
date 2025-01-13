import java.util.Scanner;

public class Constant{
	static final double pi = 3.142;

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		int radius = scan.nextInt();
		
		Constant.area(radius);
	}
	public static void area(int radius){
		double areaOfCircle = pi*radius*radius;
		System.out.printf("The area of the circle is %.2f%n", areaOfCircle);
	}
}