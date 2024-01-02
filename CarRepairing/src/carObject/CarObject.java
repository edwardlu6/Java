package carObject;

public class CarObject {
	
	//Member Variables
	private String brand;
	private int servicePrice;
	private String reparationStatus;
	private String ownerName;
	
	//Constructors
	//A constructor is a method that has same name as the class
	
	//To create OBJECTS of type this class
	
	//As many constructors as we want.
	
	//Default Constructor ----argument list is empty
	
	public CarObject() {
		brand="";
		servicePrice=0;
		reparationStatus="";
		ownerName="";
	}
	
	public CarObject(String brand, int price, String ownerName) {
		this.brand=brand;
		this.servicePrice=price;
		this.reparationStatus="NO";
		this.ownerName=ownerName;
	}
	

	//source ----generate getters and setters
	// in exam, we don't need getters and setters. 

	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getServicePrice() {
		return servicePrice;
	}


	public void setServicePrice(int servicePrice) {
		this.servicePrice = servicePrice;
	}


	public String getReparationStatus() {
		return reparationStatus;
	}


	public void setReparationStatus(String reparationStatus) {
		this.reparationStatus = reparationStatus;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void PrintMe() {
		System.out.println("-----------Info------------");
		System.out.println("Brand:"+brand);
		System.out.println("Service Price:"+servicePrice);
		System.out.println("Reparation Status:"+reparationStatus);
		
		System.out.println("Owner Name:"+ownerName);
		System.out.println("-----------END-------------");
		
	}
	


}