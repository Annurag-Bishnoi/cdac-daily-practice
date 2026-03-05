package demo;
import java.util.*;
public class Patient {

	
	int patientid;
	String patname;
	int patage;
	String patgender;
	long patmobile;
	String pataddress;
	float patbp;
	String patbloodgroup;
	String patdisease;
	
	
public void details() {
	System.out.println(patientid);
	System.out.println(patname);
	System.out.println(patage);
	System.out.println(patgender);
	System.out.println(patmobile);
	System.out.println(pataddress);
	System.out.println(patbp);
	System.out.println(patbloodgroup);
	System.out.println(patdisease);
	
		
}

public void create() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Patientid : ");
	patientid=sc.nextInt();
	System.out.println("Enter Patient Name : ");
	patname = sc.next();
	System.out.println("Enter Patient Address : ");
	pataddress = sc.next();
	System.out.println("Enter Patient Age : ");
	patage = sc.nextInt();
	System.out.println("Enter Patient Blood Group : ");
	patbloodgroup = sc.next();
	System.out.println("Enter Patient Blood Pressure : ");
	patbp = sc.nextInt();
	System.out.println("Enter Patient Gender : ");
	patgender = sc.next();
	System.out.println("Enter Patient Mobile Number : ");
	patmobile = sc.nextLong();
	System.out.println("Enter Patient Disease : ");
	patdisease = sc.next();
}
}