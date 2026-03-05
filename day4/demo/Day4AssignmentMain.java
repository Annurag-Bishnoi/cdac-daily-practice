package demo;
import java.util.*;
public class Day4AssignmentMain {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***************Day 4 Session 2 Assignment*************");
		System.out.println("Question 1 : Employee Salary Management System ");
		System.out.println("Question 2 : Bank Account Transaction System ");
		System.out.println("Question 3 : Student Result Processing System ");
		System.out.println("Question 4 : Online Shopping Cart System");
		System.out.println("Question 5 : Library Book Management");
		System.out.println("Question 6 : Electricity Bill Generator");
		System.out.println("Enter The Question no. You Want to Try : ");
		int x=sc.nextInt();
		
		
		AssignmentDay4Q1 e1 = new AssignmentDay4Q1(11,"anur",35);
		
		AssignmentDay4Q1.Employee q1=e1.new Employee();

		
		switch(x) {
		
		
		case 1 :
			System.out.println("Question 1");
			System.out.println("");
			 System.out.println("Enter the Employee Details");
			 System.out.println("Employee ID is:");
			 e1.empid = sc.nextInt();
			 System.out.println("Employee Name is:");
			 e1.empname = sc.next();
			 System.out.println("Employee Salary is:");
			 e1.empsalary = sc.nextFloat();
			 q1.calculateSalary();
			 break;
		case 2 :
			System.out.println("Enter Your Account Number : ");
			long accno=sc.nextLong();
			System.out.println("Enter Your Account Holder Name : ");
			String accname=sc.next();
			System.out.println("Enter Your Balance : ");
			double userbal=sc.nextDouble();
			BankAccountTranscSystem b1=new BankAccountTranscSystem(accno,accname,userbal);
			BankAccountTranscSystem.Transaction t1 = b1.new Transaction();
			t1.display();
			while(true) {
			System.out.println();
			System.out.println("1. Deposite");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance ");
			System.out.println("Enter : ");
			int y=sc.nextInt();
			switch(y) {
			
			case 1:
			t1.deposite(userbal);
			System.out.println();
			break;
			case 2:
			t1.withdraw(userbal);
			break;
			case 3:
				t1.display();
			}
			}
		
		
		case 3 :
			System.out.println("Enter the Roll Number:");
			int rollno = sc.nextInt();
			System.out.println("Enter the Student Name:");
			String name = sc.next();
			System.out.println("Enter the Obtained Marks");
			double marks = sc.nextDouble();
			
			Student s1 = new Student(rollno,name,marks);
			Student.Result r1 = s1.new Result();
			r1.display();
			r1.gradeSystem(marks);
			break;
			
		case 4 :
			System.out.println("Enter Your Product Id : ");
			int productId=sc.nextInt();
			System.out.println("Enter Your Product Name : ");
			String productName =sc.next();
			System.out.println("Enter Your Price : ");
			double price = sc.nextDouble();
			System.out.println("Enter the Quantity of Your Product:");
			int quantity = sc.nextInt();
			
			Product p1 = new Product(productId,productName, price, quantity);
			Product.cart c1 = p1.new cart();
			
			double totalbill = price*quantity;
			c1.calculateTotalBill(totalbill);
			
		break;
		
		
		
		
		
		
		
		case 5 :
			System.out.println("Enter Your Book Id : ");
			int bookid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Your Book Title : ");
			String booktitle =sc.nextLine();
			System.out.println("Enter Book Author Name : ");
			String authname = sc.nextLine();
			System.out.println("Enter the Price of Book :");
			double bookprice = sc.nextDouble();
			
			Book b2 =new Book(bookid,booktitle,authname,bookprice);
			Book.Library l1=b2.new Library();
			l1.totalbill(bookprice);
			l1.display();
			
			
			
		case 6 :
			
			System.out.println("Enter your");
			
		case 7 :
		case 8 :
		case 9 :
		case 10 :
			System.out.println("**********Work In Progress**********");
			break;
			default:
				break;
		}
	}
}
