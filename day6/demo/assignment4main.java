package demo;
import java.util.*;



public class assignment4main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Question 1 : Employee Salary Calculation ");
		System.out.println("Question 2 : Vehicle and Car");
		System.out.println("Question 3 : Multilevel Inheritance – Student Academic System");
		System.out.println("Question 4 : Hierarchical Inheritance – Bank Account System");
		System.out.println("Question 5 : Hierarchical Inheritance – Employee Role System");
		System.out.println("Enter Question No. to Try !!!!");
		int x=sc.nextInt();
		
		switch(x) {
		
		case 1:
			  
			System.out.println("Enter The Size of Employee dataset : ");
			int size=sc.nextInt();
			
			Manager[] m1=new Manager[size];

			for(int i=0;i<size;i++) {
				System.out.println("\nEnter details for manager " + (i + 1) + " ");
				System.out.println("Enter Employee Id  : ");
				int eid=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employee Name  : ");
				String ename=sc.nextLine();
				System.out.println("Enter Employee Salary  : ");
				double basicsalary=sc.nextDouble();
				System.out.println("Enter Employee Bonus is : ");
				double bonus=sc.nextDouble();
				 m1[i] = new Manager(eid, ename, basicsalary, bonus);
			}
			
			for(int i=0;i<size;i++) {
				m1[i].displaydetail();
				m1[i].totalsalary();
				System.out.println();
			}
			break;
			
			
			
			
			
			
			
			
			
			
			
			
		case 2:
			
			System.out.println("How Many Vechile : ");
			int size2=sc.nextInt();
			
			Car[] v1=new Car[size2];

			for(int i=0;i<size2;i++) {
				System.out.println("\n Enter details for Vehicle " + (i + 1) + " ");
				System.out.println("Enter Vehicle Number  : ");
				int vnum=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Vehicle Brand  : ");
				String vbrand=sc.nextLine();
				System.out.println("Enter Vehicle Price  : ");
				double vprice=sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter Vehicle Owner Name : ");
				String vownername=sc.nextLine();
				 v1[i] = new Car(vnum,vbrand,vprice,vownername);
			}
			
			for(int i=0;i<size2;i++) {
				v1[i].showVehicleInfo();
				v1[i].displayCarPrice();
				System.out.println();
			}
			break;
			
			
			
			
			
			
			
			
		case 3:
			System.out.println("Enter The Numbers of Students : ");
			int size3=sc.nextInt();
			
			sc.nextLine();
			
			Result[] r1=new Result[size3];
			for (int i=0;i<size3;i++) {
				
				System.out.println("Enter Your "+(i+1)+" Student Detail ");
				
				System.out.println();
				
			System.out.println("Enter Your Name : ");
			String sname=sc.nextLine();
			System.out.println("Enter Your Roll No. : ");
			int srollno=sc.nextInt();
			System.out.println("Enter Your Marks Physics : ");
			int phymarks=sc.nextInt();
			System.out.println("Enter Your Marks Mathmetics : ");
			int mathmarks=sc.nextInt();
			System.out.println(":Enter Your Chemistry Marks : ");
			int chemmarks=sc.nextInt();
			r1[i]=new Result(sname,srollno,phymarks,mathmarks,chemmarks);
			sc.nextLine();
			}
			for (int i=0;i<size3;i++) {
				System.out.println("Student "+(i+1)+": ");
				r1[i].displayStudent();
				r1[i].displayMarks();
				r1[i].calculateTotal();
				System.out.println();
			}
			
			break;
			
		case 4:
		case 5:
		case 6:
			default:
		}
		
		
		
	}
	
	
	
}
