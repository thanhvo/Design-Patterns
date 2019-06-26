import java.io.*;

public abstract class Employee {
	SalaryCalculator empType;
	String name;
	String ID;
	// invariable parts
	public Employee(String empName, String empID) {
		name = empName;
		ID = empID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getID() {
		return ID;
	}
	
	public String toString() {
		String str = " Emp Name:: " + getName() + " EmpID:: " + getID();
		return str;
	}
	
	public void save() {
		FileUtil futil = new FileUtil();
		futil.writeToFile("emp.txt", this.toString());
	}
	
	//variable part of the behavior
	public abstract String computeCompensation();
	
	public Employee(String s, SalaryCalculator c) {
		name = s;
		empType = c;
	}
	
	public void display() {
		System.out.println("Name=" + name);
		System.out.println("salary= " + empType.getSalary());
	}
}
