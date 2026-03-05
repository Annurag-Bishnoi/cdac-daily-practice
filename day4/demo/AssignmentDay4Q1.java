package demo;

import java.util.Scanner;

public class AssignmentDay4Q1 {
	
	int empid;
	String empname;
	float empsalary; 

	AssignmentDay4Q1(int id , String name, float basicSalary){
		this.empid=id;
		this.empname=name;
		this.empsalary=basicSalary;
	}

	
	 class Employee {
		 
		 
		void calculateSalary() {
			 double hra=(empsalary*0.20);
			 System.out.println("Your HRA is : "+ hra);
			 double da=(empsalary*0.10);
			 System.out.println("Your DA is : "+da);
			 double finsal=empsalary+da+hra;
			System.out.println("Your Total Salaray  : "+finsal);
		}
		
		
			
		
		 

	 }
}
