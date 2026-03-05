package demo;

public class ElectricityBill {
	
	int consumerId;
	String consumerName;
	int unit;
	
	
	
	
	public ElectricityBill(int consumerId, String consumerName, int unit) {
		this.consumerId = consumerId;
		this.consumerName = consumerName;
		this.unit = unit;
	}
	
	class BillCalculator{
		
		void calculate(int unit){
			if(unit>=0 & unit<=100 ) {
		    int price = 5*unit;
		    System.out.println("Total Price is : "+price);
			}
			else if(unit>100 & unit<=200) {
				int price = 500+(unit-100)*7;
				System.out.println("Total Price is : "+price);
			}
			else if(unit>200) {
				int price = 1200+unit*10;
				System.out.println("Total Price is : "+price);
			}
			
			
		}
		
	}
	
}
	


