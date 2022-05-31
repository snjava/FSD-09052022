public class ArithmeticOperator
{
	public static void main(String args[])
	{
		//int a = 10, b = 20;
		int a = 10;
		int b = 3;

		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;

		System.out.println(add); // 13
		System.out.println(sub); // 7
		System.out.println(mul); // 30
		System.out.println(div); // 3
		System.out.println(mod); // 1

		byte x = 10;
		x = (byte)(x + 1); // Explicit Casting
		System.out.println(x); // 11 
		
	
	}
}