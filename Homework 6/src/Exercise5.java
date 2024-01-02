//This homework is completed by Karla Murueta and Edward Lu


public class Exercise5 {
	
	public static void main(String[] args) {

		Account account = new Account(1122, 20000);// create Account object 'account' with an account ID of 1122, a balance of $20,000.
		account.setAnnualInterestRate(4.5); // set an annual interest of 4.5%

		// withdraw 2500
		account.withdraw(2500); 

		// deposit 3000
		account.deposit(3000);

		account.PrintMe();
	}	
}
