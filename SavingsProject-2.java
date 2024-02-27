
import java.util.Scanner;

public class SavingsProject {
	public static void main(String[] args) {
		System.out.println("Enter initial deposit, monthly deposit, interest rate, compounding frequence, and number of years to calculate interest");

		Scanner g = new Scanner(System.in);
		double initialDeposit = g.nextDouble();
		double monthly = g.nextDouble();
		double interestRate = g.nextDouble();
		String compoundingFrequency = g.next();
		int yearly = g.nextInt();
		double monthlyinterest = 1 + (.01 * interestRate) / 12;
		double dailyinterest = 1 + (.01 * interestRate) / 365;

		System.out.println("Simulating " + initialDeposit + " plus " + " monthly " + " per month at " + interestRate + "% APY compounded yearly for " + yearly + "years:");

		for (int i = 1; i <= yearly; i++) {
			if (compoundingFrequency.equals("yearly")) {
				System.out.println("Year " + i + " balance is " + (initialDeposit + monthly) * Math.pow(1 + interestRate / 100, i));
			}
			else if (compoundingFrequency.equals("monthly")) {
				System.out.println("Month " + i + "balance is " + (initialDeposit + monthly) * Math.pow(monthlyinterest, i));
			}
			else if (compoundingFrequency.equals("daily ")) {
				System.out.println("Daily balance for " + yearly + " year(s)is " + (initialDeposit + monthly) * Math.pow(dailyinterest, i));
				 monthly = 1 + (.01 * interestRate) / 12;
			
			}
		}
	}
}
