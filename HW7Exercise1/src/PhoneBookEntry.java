
public class PhoneBookEntry {

	// initializing all member variables of 'PhoneBookEntry' class

	private String lastName;
	private String firstName;
	private int id = -1;
	private String email;
	private int zipCode;
	private int phoneNumber;

	
	// default constructor
	public PhoneBookEntry() {
		
	}
	
	// constructors with different parameter lists
	public PhoneBookEntry(String lastName, String firstName, int id,String email, int zipCode,int phoneNumber) {
		this.lastName=lastName;
		this.firstName = firstName;
		this.id=id;
		this.email=email;
		this.zipCode=zipCode;
		this.phoneNumber=phoneNumber;
	}
	

	
	public PhoneBookEntry(String firstName,int phoneNumber) {
		this.phoneNumber= phoneNumber;
		this.firstName=firstName;
	}
	
	public PhoneBookEntry(String firstName) {
		this.firstName=firstName;
	}

	// Getter/Setter
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// method to print all member variables of 'PhoneBookEntry' class
	public void printBookEntry() {
		System.out.println("Last Name: "+lastName);
		System.out.println("First Name: "+firstName);
		System.out.println("ID: "+id);
		System.out.println("Email: "+email);
		System.out.println("Zip Code: "+zipCode);
		System.out.println("Phone Number: " + phoneNumber);
	}



}
