package iPhoneAPP;

import java.util.*;
// declare a variable outside the main ----global variable

public class TheAPP {

	static Scanner sc = new Scanner(System.in);
	static PhoneBookEntry[] myiPhone = new PhoneBookEntry[5];
	static int entriesSoFar = 0;

	public static void main(String[] args) {
		
		for (int i = 0; i < myiPhone.length; i++) {
	        myiPhone[i] = new PhoneBookEntry();
	    }
		// inside a method----local variable

		// 1.ADD----deadline Thursday
		// 2.Delete
		// 3.Search
		// 4.Edit
		// 5. Display
		// 6.Exist
		
		int option = menu();
		
		do {
			if (option == 1) {
				System.out.println("Enter a first name");
				String newFirstName = sc.next();
				System.out.println("Enter a last name");
				String newLastName = sc.next();
				System.out.println("Enter a phone number");
				int phoneNumber = sc.nextInt();
				if (entriesSoFar < 5) {
					add(newFirstName, newLastName, phoneNumber);
				} else {
					System.out.println("You cannot add anymore--exceeded space");

				}
			} else if (option == 2) {
				System.out.println("Enter a first name:");
				String searchFName = sc.next();
				System.out.println("Enter a last name:");
				String searchLName = sc.next();

				delete(searchFName, searchLName);
			} else if (option == 3) {
				System.out.println("Enter a first name:");
				String searchFName = sc.next();
				System.out.println("Enter a last name:");
				String searchLName = sc.next();

				int index = search(searchFName, searchLName);
				if (index != -1) {
					System.out.println(search(searchFName, searchLName));
				}
			} else if (option==4) {
				System.out.println("Enter a first name:");
				String searchFName = sc.next();
				System.out.println("Enter a last name:");
				String searchLName = sc.next();
				edit(searchFName,searchLName);
				
			} else if (option == 5) {
				display();
			}
			option=menu();
		} while (option != 6);

	}

	// Menu.
	public static int menu() {
		System.out.println("Welcome to my iPhone!");
		System.out.println("Press 1 for add");
		System.out.println("Press 2 for delete");
		System.out.println("Press 3 for search");
		System.out.println("Press 4 for edit");
		System.out.println("Press 5 for display");
		System.out.println("Press 6 for exit");
		int choice = sc.nextInt();
		return choice;
	}

	// defining the display method
	public static void display() {
		for (int i = 0; i < myiPhone.length; ++i) {
			myiPhone[i].PrintMe();
			System.out.println();
		}
	}

	// 1. ADD function ----Class's version
	public static void add(String Fname, String Lname, int Pnumber) {
		for (int i = 0; i < myiPhone.length; i++) {
			if (myiPhone[i].getFname().equals("")) {
				entriesSoFar++;
				myiPhone[i].setFname(Fname);
				myiPhone[i].setLname(Lname);
				myiPhone[i].setPnumber(Pnumber);
				
				System.out.println("In your directory you have " + entriesSoFar + " entries");
				break;
			}

		}
	}


	// 2. Delete function
	public static void delete(String firstName, String lastName) {

		int index = search(firstName, lastName);
		if (index != -1) {
			myiPhone[index].setFname("");
			myiPhone[index].setLname("");
			myiPhone[index].setPnumber(0);

			entriesSoFar--;
		} else {
			System.out.println("Entry not found----cannot delete.");
		}
	}

	// 3. search method
	public static int search(String firstName, String lastName) {
		for (int i = 0; i < myiPhone.length; i++) {
			if (firstName.equals(myiPhone[i].getFname()) && lastName.equals(myiPhone[i].getLname())) {
				myiPhone[i].PrintMe();
				return i;
			}

		}
		System.out.println("No such entry");
		return -1;
	}

	
	  // 4. Edit function 
	 public static void edit(String Fname, String Lname) {
		 	
		 	int index = search(Fname, Lname);
		 	if (index != -1) {
		 		System.out.println("Enter a new first name:");
				String newFName = sc.next();
				System.out.println("Enter a new last name:");
				String newLName = sc.next();
				System.out.println("Enter a new phone number");
				int newPhoneNumber = sc.nextInt();
				myiPhone[index].setFname(newFName);
				myiPhone[index].setLname(newLName);
				myiPhone[index].setPnumber(newPhoneNumber);
		 	} else {
				System.out.println("Entry not found----cannot edit.");
		 	}
		 
	 }
}
