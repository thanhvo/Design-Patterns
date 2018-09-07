import junit.framework.TestCase;

public class MainApp  extends TestCase{
	public void test_Interface() {
		SalaryCalculator c = new CategoryA(10000, 200);
		Employee e = new FieldWorker("Jennifer", c);
		e.display();
		c = new CategoryB(20000, 800);
		e = new Clerk("Shania", c);
		e.display();
	}
	
	public void test_Abstract_Class() {
		Employee e = new Consultant("Jennifer", "1");
		System.out.println(e.computeCompensation());
		e = new SalesRep("Shania", "1");
		System.out.println(e.computeCompensation());
	}
	
	public void test_Private_Methods() {
		OrderManager om = new OrderManager();
		om.saveOrder("Macbook", 10);
	}
}
