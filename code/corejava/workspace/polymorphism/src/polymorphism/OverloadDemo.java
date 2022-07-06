package polymorphism;

public class OverloadDemo {
	public static void main(String[] args) {
		Calculate cal1 = new Calculate();
		cal1.add(23, 12);
		cal1.add(23,2 ,4 );
		cal1.add(23.34, 11.11);
	}
}

class Calculate {
	public int add(int a, int b) {
		int ans = a + b;
		System.out.println("Addition of 2 int : " + ans);
		return ans;
	}
	
	protected int add(int a, int b , int c) {
		int add = a + b + c;
		System.out.println("Addition of 3 int  : " + add);
		return add;
	}
	
	public void add(double a, double b) {
		double add = a + b;
		System.out.println("Addition of 2 double : " + add);
	}
	
}








