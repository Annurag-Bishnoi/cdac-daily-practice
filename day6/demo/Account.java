package demo;

public class Account{
	int accnumber;
	String customername;
	double balance;
	
	
	
	public Account(int accnumber, String customername, double balance) {
		this.accnumber = accnumber;
		this.customername = customername;
		this.balance = balance;
	}
	
	
	void displayAccount() {
		System.out.println("Account Number:"+ accnumber);
		System.out.println("Customer Name:"+ customername);
		System.out.println("Balance of Your Account:"+ balance);
	}
	
	
	

}
