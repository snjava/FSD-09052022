public class SingleInheritance {
	
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
	}
}
class A 
{
	int x = 20;
	public void m1() {
		System.out.println("m1() from class A");
	}
}

// Parent class is 'A' and child class is 'B'
class B extends A
{
	public void m2() {
		System.out.println("x : " + x); // accessing variable of parent class
		m1(); // accessing method of parent class
		System.out.println("m2() from class B");
	}
}
