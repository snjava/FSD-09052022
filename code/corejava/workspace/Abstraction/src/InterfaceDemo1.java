
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Inter i1 = new Test1();
	}
}

interface Inter {
	int a=10; // public static final
	void m1(); // public abstract
	void m2();
}

abstract class Test implements Inter {
	
}

class Test1 extends Test {
	public void m1() {
		
	}
	public void m2() {
		
	}
}

class Demo implements Inter {
	public void m1() {
		
	}
	public void m2() {
		
	}
}

