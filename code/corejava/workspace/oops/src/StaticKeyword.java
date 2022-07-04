

// Compile : javac StaticKeyword.java
// Run : java StaticKeyword.main()

public class StaticKeyword {
	int a = 10; // instance variable
	static int b = 20; // static/class variable
	
	static String companyName;
	
	static {
		companyName = "Abc Pvt. Ltd.";
	}
	
	public static void main(String[] args) {

	}

	public void m1() {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	
	
	public static void m2() {
		//System.out.println("a : " + a); non static variable cannot be access from static method
		System.out.println("b : " + b);
	}
	
}

class StaticDemo {
	public void print() {
		//System.out.println("a : " + a);
		System.out.println("b : " + StaticKeyword.b);
	}
}


class A {
	
	static class B {
		
	}
	
}


















