import java.util.*;

public class PhoneBook {

	public static void main(String[] args) {
		// create three objects of 'PhoneBookEntry' class with different arguments in constructors.
		PhoneBookEntry first = new PhoneBookEntry("Smith", "John", 5, "jsmith@gmail.edu", 20037,2023334444);
		PhoneBookEntry second = new PhoneBookEntry("James", 202344344);
		PhoneBookEntry third = new PhoneBookEntry("Sarah");
		
		first.setPhoneNumber(202555555); // change 'first' phone number 
		first.printBookEntry(); // print all information of 'first' object.
		second.setZipCode(first.getZipCode()); // change 'second' zip code to 'first' zip code.
		
		

	}

}
