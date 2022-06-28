class Employee
{
	private int empId;
	private String name;
	private double salary;
	
	public void setId(int i) {
		empId = i;
	}
	public void setName(String nm) {
		name = nm;
	}
	public void setSalary(double sal) {
		salary = sal;
	}	

	public int getId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}

}

public class Encapsulation_2
{
	public static void main(String arr[])
	{
		Employee emp = new Employee();
		emp.setId(121);
		emp.setName("Abc");
		emp.setSalary(11111.11);

		Encapsulation_2 enc = new Encapsulation_2();
		enc.displayEmpDetails(emp);
		
	}

	public void displayEmpDetails(Employee emp) {
		System.out.println("Id : " +  emp.getId());
		System.out.println("Name : " +  emp.getName());
		System.out.println("Salary : " +  emp.getSalary());
	}
}