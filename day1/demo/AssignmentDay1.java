package demo;
//import java.util.*;

import java.util.Scanner;

public class AssignmentDay1 {
	
	
//	Rectangle Area function
	static double rec_Area(double length, double width) {
		
		return length*width;
	}
	
//	Converting Celsius to Fahrenheit
	
	public static double celtofahr(double celsius) {
		
	double fahrenheit=(celsius * 9/5) + 32;
	System.out.println(fahrenheit);
	return fahrenheit;
}
	
//	Calculating Average of Three Subject
	public static int averagemark(int phymark, int chemmark,int mathmark) {
	int avgmarks = (phymark+chemmark+mathmark)/3;
	
	System.out.println("Here is Your Average of 3 Subjects : "+ avgmarks);
	return avgmarks;
	}
	
//	Swap Two Number WithoutUsing Third Number
	
	public static void swappednum(int num1, int num2) {
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	
	System.out.println("Here is Swapped No.:");
	System.out.println("Here is Number 1 : "+num1);
	System.out.println("Here is  Number 2 : " +num2);
	return;
	}
	
//	Price After Discount
	
	public static void priceafterdiscount(double product, double discount) {
    double final_price=(product-(product*discount)/100);
     
		
		System.out.println("Here is Your Price After Applying Discount : "+final_price);
		return;
		
		
		
	}

	
//	Checking Pass or Fail

	 public static void checkpass(int stdmarks,String stdname) {
	 if(stdmarks>=40) {
		 System.out.println("Congratulations!!!!!!  You Passed "+stdname);
		 
	 }
	 else {
		 System.out.println("Better Luck Next Time");
	 }
	 
	 return;
	 }
	 
	
//	Checking Even or Odd
	 public static void checkevenodd(int num) {
	if(num%2==0) {
		System.out.println("Given number is even");
	}
	else{
		System.out.println("Given number is odd");
	}
	return;
	 }
//	Finding Largest Number
	
    public static void checklargest(int first, int second) {
    if(first>second) {
    	System.out.println("The largest Number is : "+ first);
    }else {
    	System.out.println("The largest Number is : "+ second);
    }
  return;
    }
//	Calculating Simple Interest
	
	public static void findSI(double principle, double rate, int time) {
	double SI=(principle *rate*time)/100;
	System.out.println("Here is Your Interest = "+ SI);
	if(SI>=1000) {
		System.out.println("The  Interest is Verys High!!!");
	}else {
		System.out.println("The Simple Interest is Low!!! Good You Can Consider it ");
	}
	double totalamount=principle+SI;
	System.out.println("The Total Amount After "+time+"Year is paid to = "+totalamount);
	
	return;
	}
	
	
	
//	Checking Whether Person is Child , Teenager, Adult
	public static void checkage(int age) {
	if(age>=18) {
		System.out.println("person is adult");
	}
	else if(age>=13 & age<=18) {
		System.out.println("person is teeneger");
		
		
	}else {
		
		System.out.println("person is child2");
	}
	return;}
	
	
//	CalCulating Salary After Bonus
	public static double bonusadd  (double salary, double bonus)
	{
	double	finalsalary=salary+bonus;
	

		
	return finalsalary;	
	}
//	Checking Character is Uppercase or Lowercase
	public static void findChar(char var) {
		
		if(var>='A'& var<='Z') {
			System.out.println("Your Character is Uppercase");
		}else if (var>='a'&var<='z') {
			System.out.println("Your Character is Lowercase");
		}else {
			System.out.println("Enter a Valid Character : ");
		}
		return ;
	}
//	Checking Number Postive Negative

	public static void checknumpostive(int number) {
		
		if(number>0) {
			System.out.println("Your number is positive");
		}else if (number<0) {
			System.out.println("Your number  is negative");
		}else {
			System.out.println("your number is zero ");
		}
		return ;
	}
	
//	Calculating Electricity Bill
public static double totalbill(double unit, double rate2) {
		
		double finalbill=unit*rate2;
		return finalbill;
	}
	
	
//	Checking Voting Eligibility
	public static void votingelgibility(int age2) {
		if(age2>=18) {
			System.out.println("You Are Eligible for Vote  ");
		}else {
			System.out.println("Sorry you are Not Eligible for Vote");
		}
		return ;
	}
	
//	--------------------------------------------------------------------------------------------------------------------------
//	---------------------------------------------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Find Rectangle Area  ");
		System.out.println("2.Converting Celsius to Fahrenheit ");
		System.out.println("3. Calculating Average of Three Subject ");
		System.out.println("4.Swap Two Number WithoutUsing Third Number");
		System.out.println("5.Calcualate Price After Discount ");
		System.out.println("6.Checking Pass or Fail ");
		System.out.println("7.Checking Even or Odd ");
		System.out.println("8. Finding Largest Number");
		System.out.println("9.Calculating Simple Interest ");
		System.out.println("10. Checking Whether Person is Child , Teenager, Adult");
		System.out.println("11.CalCulating Salary After Bonus ");
		System.out.println("12.Checking Character is Uppercase or Lowercase ");
		System.out.println("13.Checking Number is postive number or negative ");
		System.out.println("14.Calculating Electricity Bill ");
		System.out.println("15.Checking Voting Eligibility ");
		System.out.println("What You want to do !!!");
		int x=sc.nextInt();
		
		switch(x) {
		
		case 1:
//		Rectangle Area function
		System.out.println("Please Enter length of rectangle");
		double length=sc.nextDouble();
		System.out.println("Please Enter width of rectangle");
		double width=sc.nextDouble();
		rec_Area(length,width);
		break;
//		Converting Celsius to Fahrenheit
		case 2:
		System.out.println("Please Enter Temperature in Celsius");
		double celsius=sc.nextDouble();
		celtofahr(celsius);
		
		break;
	
//		Calculating Average of Three Subject
		case 3:
		System.out.println("Please Enter Physics Marks :");
		int phymark=sc.nextInt();
		System.out.println("Please Enter Chemistry Marks :");
		int chemmark= sc.nextInt();
		System.out.println("Please Enter Mathmatics Marks :");
		int mathmark=sc.nextInt();
		averagemark(phymark,chemmark,mathmark);
		break;
//		Swap Two Number WithoutUsing Third Number
		case 4:
		System.out.println("Enter the First Number");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number");
	    int num2=sc.nextInt();
	    swappednum(num1,num2);
	    break;
	    
//		Price After Discount
		case 5:
	    System.out.println("Ënter your Product Price:" );
			double product=sc.nextDouble();
			System.out.println("Enter The Discount On The Product(in Percentage)");
			double discount=sc.nextDouble();
			priceafterdiscount(product,discount);
			break;
			
//			Checking Pass or Fail
		case 6: 
				 System.out.println("Enter Your Name : ");
				 String stdname=sc.nextLine();
				 
				 System.out.println("Please Enter Your Marks : ");
				 int stdmarks=sc.nextInt();
				 checkpass(stdmarks,stdname);
				 break;

				 
				 
				 
//					Checking Even or Odd
		case 7:
					System.out.println("Enter the number");
					int num=sc.nextInt();
					checkevenodd(num);
					break;
					
//					Finding Largest Number
		case 8:	
					System.out.println("Enter the First Number");
					int first=sc.nextInt();
					System.out.println("Enter the Second Number");
				    int second=sc.nextInt();
					checklargest(first,second);
					break;
//					Calculating Simple Interest
		case 9:		
					System.out.println("*****Lets Calculate Simple Interest********");
					
					System.out.println("Please Enter the Principle Amount : ");
					double principle=sc.nextDouble();
					System.out.println("Please Enter the Rate of Interest : ");
					double rate=sc.nextDouble();
					System.out.println("Please Enter the Time (in Year) : ");
					int time=sc.nextInt();
					findSI(principle,rate,time);
					
					break;
//					Checking Whether Person is Child , Teenager, Adult
		case 10:
					System.out.println("please enter your age");
					int age=sc.nextInt();
					checkage(age);
					break;
//					CalCulating Salary After Bonus	
		case 11:
					System.out.println("Please Enter Your Salary :");
					double salary=sc.nextDouble();
					System.out.println("Please Enter Your Bonus : ");
					double bonus=sc.nextDouble();
					bonusadd(salary,bonus);
					break;
//Checking Character is Uppercase or Lowercase
		case 12:
                      System.out.println("Please Enter a valid Character : ");
                      char var=sc.next().charAt(0);
					findChar(var);
					break;
					
//	Checking Postive Negative
		case 13:
					System.out.println("Please Enter a Number");
					int number=sc.nextInt();
					checknumpostive(number);
					break;
					
//					Calculating Electricity Bill
		case 14:
					System.out.println("Please Enter Your Bill Units : ");
					double unit=sc.nextDouble();
					System.out.println("Please Enter Your Rate : ");
					double rate2=sc.nextDouble();
					totalbill(unit,rate2);
					break;
					
//					Checking Voting Eligibility
		case 15:
					System.out.println("Please Enter your Age : ");
					int age2=sc.nextInt();
					votingelgibility(age2);
					break;
					
		default:
			System.out.println("Please Enter a Valid Number!!!");
		}	
	}

}
