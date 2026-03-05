package demo;

public class Manager extends Employee{

	double bonus;
	public Manager(int empid, String empname, double basicsalary, double bonus) {
		super(empid, empname, basicsalary);
		this.bonus=bonus;
	}
	
	
	void  displaydetail() {
		System.out.println("Employee Id is : "+empid);
		System.out.println("Employee Name is : "+empname);
		System.out.println("Employee Salary  is : "+basicsalary);
		System.out.println("Employee Bonus is : "+bonus);
//		System.out.println("Employee Total Salary is  : ");
		
	}
	
	void totalsalary() {
		double totsalary=basicsalary+bonus;
		System.out.println("Total Salary is : "+totsalary);
	}
}