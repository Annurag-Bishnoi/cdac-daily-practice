package demo;

public class Vehicle {
int vehiclenum;
String brand;
public Vehicle(int vehiclenum, String brand) {
	
	this.vehiclenum = vehiclenum;
	this.brand = brand;
}

void showVehicleInfo(){
	System.out.println(" Vehicle Number : "+ vehiclenum);
	System.out.println("Brand : "+brand);
	
}
}
