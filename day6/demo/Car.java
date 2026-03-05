package demo;

public class Car extends Vehicle {
   double price;
   String OwnerName;
	public Car(int vehiclenum, String brand,double price,String OwnerName) {
		super(vehiclenum, brand);
		this.price=price;
		this.OwnerName=OwnerName;
	}
	
	
	void displayCarPrice() {
		
		System.out.println("Car Price is : "+price);
		System.out.println("Car Owner Name is : "+OwnerName);
	}
	

}
