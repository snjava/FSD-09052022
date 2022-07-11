
public class IntrefaceInheritance {
	public static void main(String[] args) {

	}
}

interface Inter1 {
	int a = 10;
	public void m1();
}

interface Inter2 {
	int a = 20;
	public void m2();
}
// Multiple interface using inheritance
interface Inter3 extends Inter1, Inter2 {
	public void m3();
}

// One class can implements the property from more than one interface.
class Demo1 implements Inter1, Inter2 {
	public void m1() {
		System.out.println(Inter1.a);
		System.out.println(Inter2.a);
	}
	public void m2() {
	}
}

// One class can Extends another class and implement one or more interface.
class Demo2 extends Demo1 implements Inter1, Inter2 {
	
}


