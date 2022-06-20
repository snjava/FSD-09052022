public class StringDemo1
{
	public static void main(String args[])
	{
		String str1 = new String("Hello");
		String str2 = "Hello";

		System.out.println(str1); // Hello
		System.out.println(str2); // Hello

		System.out.println(str1 == str2); // false

	}
}