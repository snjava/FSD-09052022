package pack1;

public class B extends A {

	public void printByObject() {
		A a = new A();
		System.out.println(a.p);
		System.out.println(a.q);
		System.out.println(a.r);
		//System.out.println(a.s);
	}
	
	public void printByInheritance() {
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		//System.out.println(s);
	}
}
