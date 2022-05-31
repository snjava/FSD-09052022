public class RelationalOperator
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 21;
		int c = 10;

		boolean result1 = a > b;

		System.out.println(result1); // false
		System.out.println(a >= c);  // true
		System.out.println(a < c);   // false
		System.out.println(a <= c);  // true
		System.out.println(a == c);  // true
		System.out.println(a == b);  // false
		System.out.println(a != c);  // false
		System.out.println(a != b);  // true
	}
}