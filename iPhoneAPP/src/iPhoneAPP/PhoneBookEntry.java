// Exercise 1 on Exam2
package iPhoneAPP;

public class PhoneBookEntry {
	
	//Member Variables
	private String Fname;
	private String Lname;
	private int Pnumber;
	
	private String instagram;
	
	//Constructors
	//A constructor is a method that has same name as the class
	
	//To create OBJECTS of type this class
	
	//As many constructors as we want.
	
	//Default Constructor ----argument list is empty
	
	public PhoneBookEntry() {
		Fname="";
		Lname="";
		
	}
	
	public PhoneBookEntry(String name, int number) {
		Fname=name;
		Pnumber=number;
	}
	
	public PhoneBookEntry(String Fname, String Lname, int c, String i) {
		
		this.Fname=Fname;
		this.Lname=Lname;
		this.Pnumber=c;
		this.instagram=i;
	
		
	}
	
	
	//source ----generate getters and setters
	// in exam, we don't need getters and setters. 
	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public int getPnumber() {
		return Pnumber;
	}

	public void setPnumber(int pnumber) {
		Pnumber = pnumber;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	
	public void PrintMe() {
		System.out.println("-----------Info------------");
		System.out.println("First Name:"+Fname);
		System.out.println("Last Name:"+Lname);
		System.out.println("Phone Number:"+Pnumber);
		
		System.out.println("Instagram:"+instagram);
		System.out.println("----------0000-------------");
		
	}
	
	public static void main(String[] args) {
		

	}

}
