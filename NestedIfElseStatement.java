import java.util.Scanner;

public class NestedIfElseStatement{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int mark = 25;
		String name;
		
		System.out.print("Enter your name: ");
		name = scan.nextLine();
		
		System.out.print("Enter your mark: ");
		mark = scan.nextInt();
		
		if(mark >= 90)
			System.out.println(name + " your grade is outstanding");
		
		else if(mark >= 75)
			System.out.print(name + " your grade is excellent");
		
		else if(mark >= 55)
			System.out.print(name + " your grade is good");
		
		else if(mark >= 45)
			System.out.print(name + " your grade is average");
		
		else
			System.out.print(name + " your grade is poor");
	}
}