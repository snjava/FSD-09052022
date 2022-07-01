
public class ThisKeyword {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.print();
	}
}

class Test2 {
	int a = 10;
	public Test2() {
		System.out.println("Parent: 1-Param constructor..");
	}
}

class Test extends Test2 {
	int a = 30;
	public Test() {
		this(111); // access same class constructor using this keyword
		System.out.println("No-Param constructor..");
	}

	public Test(int a) {
		this("dummy");
		System.out.println("1-Param int constructor..");
	}
	
	public Test(String a) {
		System.out.println("1-Param string constructor..");
	}
	
	
	public void print() {
		int a = 50;
		System.out.println("a : " + a);
		System.out.println("a : " + super.a); // super class variable
		System.out.println("a : " + this.a); // same class variable
	}
	
}
