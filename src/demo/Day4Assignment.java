package demo;

import java.util.Scanner;

public class Day4Assignment {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Patient p1 = new Patient();

		p1.create();
		p1.details();
		
		Doctor d1=new Doctor();
		d1.displaydoc();
		d1.entervalue();
		
		
		
	}
	
	
}
