//This homework is completed by Karla Murueta and Edward Lu


import java.util.*; 
public class Account {

	//declaring all member variables 
	private int ID; 
	private double balance; 
	private double annualInterestRate; 
	private Date dateCreated; 
	
	
	public Account(int id, double balance) {
		this.ID = id; 
		this.balance = balance; 
		this.annualInterestRate = 0.0;
	    this.dateCreated = new Date();
	}
	
	//default constructor 
	public Account() {
		
	}
	
	//getters and setters

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date dateCreated() {
		return dateCreated; 
	}

	//method for getting monthly interest
	public double getMonthlyInterest() {
	    double monthlyInterestRate = (annualInterestRate/12) / 100;
	    return balance * monthlyInterestRate;
	}
	
	// method to withdraw certain amount of money.
	public boolean withdraw(double amount) {
	    if (amount <= balance) {
	        balance -= amount;
	        System.out.println("Withdrawal successful!");
	        return true;
	    } else {
	        System.out.println("Cannot withdrawal more than account balance!");
	        System.out.println("Withdrawal failed.");
	        return false;
	    }
	}
	
	// Method to deposit certain amount of money
	public void deposit(double amount) {
	    balance += amount;
	    System.out.println("Deposit successful!");
	}
	
	// Method to display the account info.
	public void PrintMe() {
		System.out.println("---------Account Info-----------"); 
		System.out.println("ID: " + ID); 
		System.out.println("Balance: $" + balance); 
		System.out.println("Monthly Interest: $" + getMonthlyInterest()); 
		System.out.println("Date created: " + dateCreated); 	
	}
	
}
