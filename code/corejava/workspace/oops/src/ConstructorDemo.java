
public class ConstructorDemo {
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("Name : " + person.getName()); // NA
		System.out.println("Age : " + person.getAge()); // 0
		System.out.println("City : " + person.getCity()); // NA
		System.out.println("============================");
		
		Person p1 = new Person("Abc" , "Pune" , 23);
		System.out.println("Name : " + p1.getName()); // Abc
		System.out.println("Age : " + p1.getAge()); // 23
		System.out.println("City : " + p1.getCity()); // Pune
	}
}

class Person {
	private String name;
	private int age;
	private String city;
	
	// Set Values of the Private instance variable by Setter method (In Spring it is called as SI)
	// Set Values of the Private instance variable by constructor (In Spring it is called as CI)
	
	public Person() { // No parameterized constructor
		System.out.println("This is the no-paramemer constrcutor");
		name = "NA";
		city = "NA";
	}
	
	public Person(String n, String c, int a) { // 3 parameterized constructor 
		name = n;
		city = c;
		if(a>=1 && a<=100) {
			age = a;
		} else {
			System.out.println("This is Invalid Age");
			System.exit(0);
		}
		
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
}
