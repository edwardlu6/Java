import java.util.*;
import java.text.DecimalFormat;

public class Exercise1{
	
	public static void main(String[] main){
		int option;
		double balance = 0;
		double deposit = 0;
		double withdraw = 0;
		String exit = "";
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("1. View your account balance"+"\n"+"2. Deposit Cash"+"\n"+"3. Withdraw cash"+"\n"+"4. Exit"+"\n");
		
			System.out.print("Enter your selection:");
			
			//Read users' input.
			option = input.nextInt();
			
			//Use switch case function to implement different users' options
			switch (option) {
				case 1 :
					System.out.println(viewAccountBalance(balance));
					break;
				case 2 :
					System.out.print("Enter the amount you want to deposit:");
					deposit = input.nextDouble();
					balance = depositCash(deposit,balance);
					break;
				case 3:
					System.out.print("Enter the amount you want to withdraw:");
					withdraw = input.nextDouble();
					balance = withdrawCash(withdraw,balance); 
					break;
				case 4 :
					exit=exitATM();
					break;
				default:
					System.out.println("Invalid Option!");

			}
		} while (!exit.equalsIgnoreCase("Yes"));
		input.close();
	}
	
	//This method is to display account balance
	public static String viewAccountBalance(double target) {
		DecimalFormat form = new DecimalFormat("0.00");
		return "Your current balance is $" + form.format(target);
	}
	
	//This method is to deposit money into balance
	public static double depositCash(double deposit, double balance) {
		if (deposit >= 0) {
			return balance+=deposit;

		} else{
			System.out.println("Invalid depost!");
			return balance;
			
		}
	}
	
	//This method is to withdraw money from balance
	public static double withdrawCash(double withdraw, double balance) {
		if (withdraw <= balance) {
			return balance -= withdraw;
		} else {
			System.out.println("Sorry you don't have enough balance!");
			return balance;
		}
	}
	
	//This method is to terminate the ATM.
	public static String exitATM() {
		System.out.println("Have a nice day");
		return "yes";
		
	}
	

		
}


