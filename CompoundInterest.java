public class CompoundInterest{
	public static void main(String[] args){

		double principal = 51000.00;
		double interestRate = 0.05;
		double amountAfterTenYrs; 
		
		System.out.printf("%-5s %-20s%n", "Year", "Amount on deposit");
		
		for(int year = 1; year <= 10; ++year){
			
			amountAfterTenYrs = principal * Math.pow(1.0 + interestRate, year);
			
			System.out.printf("%-5d %-20.2f%n", year, amountAfterTenYrs);
		}
	}
}