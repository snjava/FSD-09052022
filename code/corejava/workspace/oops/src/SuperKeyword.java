
public class SuperKeyword {
	public static void main(String[] args) {
		Child ch = new Child(10);
		Parent p = new Parent();
		ch.print();
	}
}

class Parent {
	int a = 10;
	public Parent() {
		 System.out.println("Parent Class No-Param Constrcutor..");
	 }
	 
	 public Parent(int a) {
		 System.out.println("Parent Class 1-Param Constrcutor..");
	 }
	 
	 public void m() {
		 System.out.println("m() method from parent class...");
	 }
}

class Child extends Parent {
	int a = 30;
	 public Child() {
		 super(); // by default calls super class default constructor
		 System.out.println("Child Class No-Param Constrcutor..");
	 }
	 
	 public Child(int a) {
		 super(121); // explicitly calling super class constructor
		 System.out.println("Child Class 1-Param Constrcutor..");
	 }
	 
	 public void m() {
		 System.out.println("m() method from child class...");
	 }
	 
	 public void print() {
		 int a = 50;
		 System.out.println("a : "+ super.a); // Access the super class variable
		 super.m(); // access the super class method
	 }
}
