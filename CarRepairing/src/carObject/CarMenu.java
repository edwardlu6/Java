package carObject;

import java.util.Scanner;

import carObject.CarObject;

//Here are some assumptions and instructions for my program.
// In 2.Delete, based on my understanding, I did not decrease the number of cars(carsSoFar) by 1 after deleting. I only delete the member variable based on sub menu input. But there is still a code in comment which decreased car number.
// For 3.Edit, professor did not specify how to identify a car. So I also used brand and owner name based on the instruction for 2.delete.
// In 3.Edit, you can just type 1,2,3,or 4 in sub menu.
// In 3.Edit, the condition is correct brand or correct owner name because if one of the two variables is deleted, we can still identify the car from one variable.
// For 8.Display all cars of a specific make, based on Google Translation, I display all cars of a specific brand. 
// In 9.Display Profits, I select repaired cars and add up their service price.
// In Option 10, the sorting is in an increasing order. The question did not specify increasing or decreasing order.


public class CarMenu {
	
	
	//initializing global variables
	static Scanner sc = new Scanner(System.in);
	static CarObject[] allCars = new CarObject[5];
	static int carsSoFar = 0;

	public static void main(String[] args) {
		//asking users how many cars they want. The default is 5 cars.
		System.out.println("How many cars in the repair shop?(The default is 5)");
		int numCars=sc.nextInt(); //I assume users will always input a positive integer.
		allCars=new CarObject[numCars];
		
		//initialize CarObject arrays
		for (int i = 0; i < allCars.length; i++) {
			allCars[i] = new CarObject();
		}
		
		int option = 0;//initializing the option variable
		
		// do while loop to iterate the menu.
		do {
			option = menu();
			if (option == 1) {
				System.out.println("Enter a brand");
				String brand = sc.next();
				System.out.println("Enter a service price");
				int servicePrice = sc.nextInt();
				System.out.println("Enter an owner name");
				sc.nextLine();
				String ownerName = sc.nextLine();
				if (carsSoFar < 5) {
					add(brand, servicePrice, ownerName);
				} else {
					System.out.println("You cannot add anymore--exceeded space");

				}
			} else if (option == 2) {
				System.out.println("Enter an owner name:");
				String ownerName = sc.next();
				System.out.println("Enter a brand:");
				String brand = sc.next();

				delete(ownerName, brand);
			} else if (option == 3) { 
				System.out.println("Enter an owner name:");
				String ownerName = sc.next();
				System.out.println("Enter a brand:");
				String brand = sc.next();

				edit(ownerName, brand);
			} else if (option == 4) {
				System.out.println("Enter an owner name:");
				sc.nextLine();
				String ownerName = sc.nextLine();
				System.out.println("Enter a brand:");
				String brand = sc.nextLine();
				
				markRepaired(ownerName,brand);
			} else if (option == 5) {
				display();
			} else if (option == 6) {
				displayRepairedCar();
			} else if (option == 7) {
				displayAbovePrice();
			} else if (option == 8) {
				displaySpecificMake();
			} else if (option == 9) {
				displayProfits();
			} else if (option == 10) {
				sortAllCars();
			} else if (option == 11) {
				System.out.println("Thanks for using this java application!");
				break;
			}

			System.out.println();
		} while (option != 11);

	}

	// Menu.
	public static int menu() {

		System.out.println("Welcome to the car auto repair shop!");
		System.out.println("1.Add a Car");
		System.out.println("2.Delete a Car");
		System.out.println("3.Edit a Car");
		System.out.println("4.Mark a car as \"repaired\"");
		System.out.println("5.Display all cars and all their information");
		System.out.println("6.Display all cars that are repaired");
		System.out.println(
				"7.Display all cars that their service repair is above a certain price (the price is entered by the user)");
		System.out.println("8.Display all cars of a specific make");
		System.out.println("9.Display Profits (Total Service Price(s) made so far)");
		System.out.println("10.Sort all cars BY service price and display them sorted");
		System.out.println("11.Exit");

		int choice = sc.nextInt();
		return choice;
	}

	// 1. ADD function
	public static void add(String brand, int servicePrice, String ownerName) {
		for (int i = 0; i < allCars.length; i++) {
			if (allCars[i].getBrand().equals("")) {
				carsSoFar++;
				allCars[i].setBrand(brand);
				allCars[i].setServicePrice(servicePrice);
				allCars[i].setReparationStatus("NO");
				allCars[i].setOwnerName(ownerName);

				if (carsSoFar == 1)
					System.out.println("In the repair shop you have " + carsSoFar + " car");
				else
					System.out.println("In the repair shop you have " + carsSoFar + " cars");
				break;
			}

		}
	}

	// 2. Delete function
	public static void delete(String ownerName, String brand) {
		boolean carFound = false;

		for (int i = 0; i < allCars.length; i++) {
			if (allCars[i].getOwnerName().equals(ownerName) && allCars[i].getBrand().equals(brand)) {
				System.out.println("The car has been found!");
				carFound = true;
				
				//carsSoFar--;
				
				System.out.println("Which car info do you want to delete?");
				System.out.println("1.Brand");
				System.out.println("2.Service Price");
				System.out.println("3.Reparation Status");
				System.out.println("4.Owner Name");
				sc.nextLine();
				int choice = sc.nextInt();

				if (choice==1) {
					allCars[i].setBrand("");
					System.out.println("Brand has been deleted!");
				} else if (choice==2) {
					allCars[i].setServicePrice(0);
					System.out.println("Service price has been deleted!");
				} else if (choice==3) {
					allCars[i].setReparationStatus("");
					System.out.println("Reparation status has been deleted!");
				} else if (choice==4) {
					allCars[i].setOwnerName("");
					System.out.println("Owner name has been deleted!");
				} else {
					System.out.println("Car info did not found!");
				}
				

			}
		}
		if (!carFound) {
			System.out.println("Car has not been found!");
		}

	}

	// 3. Edit function
	public static void edit(String ownerName, String brand) {

		boolean carFound = false;

		for (int i = 0; i < allCars.length; i++) {
			if (allCars[i].getOwnerName().equals(ownerName) || allCars[i].getBrand().equals(brand)) {
				System.out.println("The car has been found!");
				carFound = true;

				System.out.println("Which car info do you want to edit?");
				System.out.println("1.Brand");
				System.out.println("2.Service Price");
				System.out.println("3.Reparation Status");
				System.out.println("4.Owner Name");
				sc.nextLine();
				int choice = sc.nextInt();

				if (choice==1) {
					System.out.println("Enter a new brand:");
					sc.nextLine();
					String newBrand = sc.nextLine();
					allCars[i].setBrand(newBrand);
					System.out.println("Info updated!");

				} else if (choice==2) {
					System.out.println("Enter a new service price:");
					sc.nextLine();
					int newServicePrice = sc.nextInt();
					allCars[i].setServicePrice(newServicePrice);
					System.out.println("Info updated!");

				} else if (choice==3) {
					System.out.println("Enter a new reparation status:");
					sc.nextLine();
					String newStatus = sc.nextLine();
					allCars[i].setReparationStatus(newStatus);
					System.out.println("Info updated!");

				} else if (choice==4) {
					System.out.println("Enter a new owner name:");
					sc.nextLine();
					String newOwnerName = sc.nextLine();
					allCars[i].setOwnerName(newOwnerName);
					System.out.println("Info updated!");

				} else {
					System.out.println("Car info did not found!");
				}

			}
		}
		if (!carFound) {
			System.out.println("Car has not been found!");
		}

	}

	// 4.Mark a car as "repaired"
	public static void markRepaired(String ownerName, String brand) {
		boolean carFound = false;

		for (int i = 0; i < allCars.length; i++) {
			if (allCars[i].getOwnerName().equals(ownerName) && allCars[i].getBrand().equals(brand)) {
				System.out.println("The car has been found!");
				carFound = true;

				allCars[i].setReparationStatus("YES");
				System.out.println("Car is repaired!");

			}
		}
		if (!carFound) {
			System.out.println("Car has not been found!");
		}
	}

	// 5.Display all cars and their info.
	public static void display() {
		for (int i = 0; i < allCars.length; ++i) {
			allCars[i].PrintMe();
			System.out.println();
		}
	}
	
	// 6.Display all cars that are repaired.
	public static void displayRepairedCar() {
		for (int i = 0; i < allCars.length; ++i) {
			if (allCars[i].getReparationStatus().equals("YES")) {
				allCars[i].PrintMe();
				System.out.println();
			}
		}
	}
	
	//7.Display all cars that their service repair is above a certain price (the price is entered by the user)
	public static void displayAbovePrice() {
		System.out.println("Enter a specific price:");
		int inputPrice=sc.nextInt();
		for (int i = 0; i < allCars.length; ++i) {
			if (allCars[i].getServicePrice() > inputPrice) {
				allCars[i].PrintMe();
				System.out.println();
			}
		}
	}
	
	//8.Display all cars of a specific make
	public static void displaySpecificMake() {
		System.out.println("Enter a specific make:");
		sc.nextLine();
		String inputMake = sc.nextLine();
		for (int i = 0; i < allCars.length; ++i) {
			if (allCars[i].getBrand().equals(inputMake)) {
				allCars[i].PrintMe();
				System.out.println();
			}
		}
	}
	
	//9.Display Profits (Total Service Price(s) made so far)
	public static void displayProfits() {
		int profits=0;
		
		for (int i = 0; i < allCars.length; ++i) {
			if (allCars[i].getReparationStatus().equals("YES")) {
				profits+=allCars[i].getServicePrice();
			}
		}
		System.out.println("Total Profits: "+profits);
	}
	
	//10.Sort all cars BY service price and display them sorted
	public static void sortAllCars() {
		int n = allCars.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (allCars[j].getServicePrice() <= allCars[j + 1].getServicePrice()) {
                    
                	CarObject temp = allCars[j];
                    allCars[j] = allCars[j + 1];
                    allCars[j + 1] = temp;
    
                }
            }
        }
        System.out.println("Sorted all cars.");
		display();
	}
	
}
