package demo;
import java.util.*;
public class BankAccountTranscSystem {
	
	long accountNumber ;
	String accountHolderName;
	double balance;
	BankAccountTranscSystem(long accountNumber,String accountHolderName,double balance){
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	class Transaction {
		Scanner sc=new Scanner(System.in);
		
		
		void deposite(double userbal) {
			System.out.println("Ënter The Deposite Amount : " );
			double depamount=sc.nextDouble();
			 userbal=userbal+depamount;
			System.out.println("Updated Balance : "+userbal);
			
		}
		void withdraw(double userbal) {
			System.out.println("Enter The Withdraw Amount : ");
			double withamount=sc.nextDouble();
			if(userbal<withamount) {
			 userbal=userbal-withamount;
			 System.out.println("Insufficiant Balance!!!");
			
			}else {
				userbal=userbal-withamount;
				System.out.println("Remaining Balance : "+userbal);
			}
			
			
		}
		void display() {
			System.out.println("Account Number Is : "+accountNumber);
			System.out.println("Account Holder Name is : "+accountHolderName);
			System.out.println("Account Balance is : "+balance);
			
		}
	}
	

}
