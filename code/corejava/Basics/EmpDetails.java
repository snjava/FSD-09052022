public class EmpDetails
{
	public static void main(String args[])
	{
		Employee emp1 = new Employee();
		
		System.out.println(emp1); // ClassName@HashCode (internally it calles toString() method)
		System.out.println("Id : " + emp1.id); // 0
		System.out.println("Salary : " + emp1.salary); // 0.0

		// accessing the variables using Object
		emp1.id = 12; 
		emp1.salary = 123123.23;

		// accessing the methods using Object
		emp1.printEmpValues(); 
	}
}

class Employee
{
	int id;
	double salary;

	public void printEmpValues()
	{
		int id = 22;
		double salary = 22222.22;
		System.out.println("Id : " + id); // 22
		System.out.println("Salary : " + salary);
	}
}





