package pack2;

import pack1.A;

public class C extends A {

	public void printByInheritance() {
		System.out.println(p);
		System.out.println(q);
		//System.out.println(r); // default/package
		//System.out.println(s); // private
	}
	
	public void printByObject() {
		A a = new A();
		System.out.println(a.p);
		//System.out.println(a.q);
		//System.out.println(a.r);
		//System.out.println(a.s);
		
		int result = a.add(23, 11);
		System.out.println(result);
		
		
	}
	
}
