package demo;

public class Product {
int productId;
String productName;
double price;
int quantity;
  
public Product(int productId, String productName, double price, int quantity) {
	
	this.productId = productId;
	this.productName = productName;
	this.price = price;
	this.quantity = quantity;
}

class cart{
	void calculateTotalBill(double totalbill) {
		if(totalbill>5000) {
			double dis=(totalbill*0.10);
			System.out.println("COngrulation You got 10 % Discount : "+ dis);
			totalbill=totalbill-dis;
			System.out.println("Your Total Bill is : "+totalbill);
		}
		else {
			totalbill=totalbill+0;
		System.out.println("Here Is Your Total Bill : "+totalbill);
		}
	}
}

	
}
