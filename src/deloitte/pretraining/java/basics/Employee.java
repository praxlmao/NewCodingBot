package deloitte.pretraining.java.basics;

public class Employee {
	int empID;
	String name;
	static String orgname = "DELOITTE";
	
	public void print()
	{
		System.out.println(empID + " " + name + " " + orgname);
	}
	

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
	    emp1.empID = 99;
		emp1.name = "nimesh";
		emp1.print();
			
		Employee emp2 = new Employee();
		emp2.empID = 100;
		emp2.name = "hridhya";
		emp2.print();
		// TODO Auto-generated method stub

	}

}
