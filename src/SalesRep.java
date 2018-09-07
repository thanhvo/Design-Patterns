
public class SalesRep extends Employee{
	// variable part behavior	
	public String computeCompensation() {
		return ("sales Rep salary is Base + commission + " + " allowance - tax deduction");
	}
	public SalesRep(String empName, String empID) {
		super(empName, empID);
	}

}
