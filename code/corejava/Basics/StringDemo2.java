public class StringDemo2
{
	public static void main(String args[])
	{
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = "Hello";
		
		System.out.println(str1 == str2); // false
		System.out.println(str3 == str4); // true
		System.out.println(str1 == str4); // false

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}
}