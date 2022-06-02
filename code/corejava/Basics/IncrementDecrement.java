public class IncrementDecrement
{
	public static void main(String args[])
	{
		int a = 10;
		++a; // a = a + 1
		System.out.println(a); // 11
		--a; // a = a - 1
		System.out.println(a); // 10

		int x = 5;
		int y = 7; 
		y = x++; // The values assigns first and updated later
		System.out.println(x); // 6
		int z = ++x; // The Value updated first and then assigns.
		System.out.println(x); // 7

		System.out.println(y); // 5
		System.out.println(z); // 7
		
	}
}






