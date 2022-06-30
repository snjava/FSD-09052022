
public class MultilevelInheritance {
	public static void main(String[] args) {
		C3 c = new C3();
	}
}

class C1
{
	public C1() {
		super();
		System.out.println("Class C1");
	}
}

class C2 extends C1
{
	public C2() {
		super();
		System.out.println("Class C2");
	}
}

class C3 extends C2
{
	public C3() {
		super();
		System.out.println("Class C3");
	}
}
