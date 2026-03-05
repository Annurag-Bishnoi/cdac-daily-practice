package demo;
import java.util.*;

public class Student {

	int rollno;
	String name;
	double marks;
	
	
	Student(int rollno,String name, double marks){
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	
	class Result{
		Scanner sc = new Scanner(System.in);
		
		void gradeSystem(double marks) {
			
			if (marks<=100 & marks>=85) {
				System.out.println("Grade A");
			}
			else if(marks<85 & marks>=60) {
				System.out.println("Result is : Grade B");
			}
			else if( marks<60 & marks>=33) {
				System.out.println("Result is: Grade C");
			}
			else if(marks>100) {
				System.out.println("Please Enter Valid Marks (marks<=100) !!!");
			}
			else{
				System.out.println("Result is: Fail");
			}
		}
		
		
		void display() {
			System.out.println("Roll Number of Student:" + rollno);
			System.out.println("Name of Student:" + name);
			System.out.println("Obtained Marks by Student:" + marks);
		}
		
	}

}
