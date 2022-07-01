
public class FinalKeyword {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = " Xyz";
		emp.salary = 24322.23;
		emp.print();
	}
}

final class Employee {
	String name;
	double salary;
	private final String companyName = "Abc Pvt.Ltd.";
	
	final public void print() {
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Company Name : " + companyName);
	}
}