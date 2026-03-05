package demo;
import java.util.*;
public class Doctor {
	
	
	int docid;
	String docname;
	String specilization;
	long docphnNo;
	String docemail;
	
	public void displaydoc() {
		System.out.println("Doctor's Id is "+ docid);
		System.out.println("Doctor's Name is "+ docname);
		System.out.println("Doctor's specilization : "+specilization);
		System.out.println("Doctor's Phone No. : "+docphnNo);
		System.out.println("Doctor's Email No. : "+docemail);
		
		
	}
	
	public void entervalue() {
		Scanner sc=new Scanner(System.in);
		System.out.println("******************Please Enter Doctor Details **********************");
		System.out.println("Doctor's Id is " );
		docid=sc.nextInt();
		System.out.println("Doctor's Name is ");
		docname=sc.next();
		System.out.println("Doctor's specilization : ");
		specilization=sc.next();
		System.out.println("Doctor's Phone No. : ");
		docphnNo=sc.nextLong();
		System.out.println("Doctor's Email No. : ");
		docemail=sc.next();

	}
	
	

}
