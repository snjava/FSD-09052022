
public class InterfaceType {
	public static void main(String[] args) {
		Product.print();
	}
}

class Product {
	public static void print() {
		
	}
}


//Marker Interface
interface I1 {
	
}

@FunctionalInterface
interface I2 {
	public void m();
}



interface I3 {
	public void m1();
	
	// JDK 1.8 onwards
	public default void m2() {
		System.out.println("(Implemented method of interface");
	}
	
	public default void m4() {
		System.out.println("(Implemented method of interface");
	}
	
	public default void m5() {
		System.out.println("(Implemented method of interface");
	}
	
	// JDK 1.8 onwards
	public static  void m3() {
		
	}
	
	// JDK 1.8 onwards
	public static void main(String[] args) {
		
	}
}


























