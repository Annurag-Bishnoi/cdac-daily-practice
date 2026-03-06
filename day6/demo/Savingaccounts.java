package demo;

public class Savingaccounts extends Account{
	
	double intrestrate;
		
	public Savingaccounts(int accnumber, String customername, double balance) {
		super(accnumber, customername, balance);
	
	}

	
	void calculateIntrest() {
		
		double intrestRate = balance*0.05;	
		System.out.println("Intrest Rate :"+ intrestRate);	
	}
	

}
