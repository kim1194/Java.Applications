import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int mark = 25;
		String name;
		
		System.out.print("Enter your name: ");
		name = scan.nextLine();
		
		System.out.print("Enter your mark: ");
		mark = scan.nextInt();
		
		switch(mark/10){
			case 10:
			case 9:
					System.out.println(name + " your grade is outstanding");
			break;
			
			case 8:
			case 7:
			case 6:
					System.out.println(name + " your grade is excellent");
			break;
			
			case 5:
					System.out.println(name + " your grade is good");
			break;
			
			case 4:
					System.out.println(name + " your grade is average");
			break;
			
			case 3:
			case 2:
			case 1:
			case 0:
					System.out.println(name + " your grade is poor");
			break;
			
		default:
			System.out.print(name + " please enter a valid score");
		}
	}
}