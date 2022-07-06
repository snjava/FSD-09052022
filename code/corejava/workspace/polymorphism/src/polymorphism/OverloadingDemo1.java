package polymorphism;

public class OverloadingDemo1 {
	public static void main(String[] args) {
		B b = new B();
		b.m();
		b.m(12);
	}
}

class A {
	public void m() {
		System.out.println("m() from CLass A");
	}
}

class B extends A {
	public void m(int a) {
		System.out.println("m(int) from Class B");
	}
}
