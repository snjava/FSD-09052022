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
		System.out.println("--------Using Equals---------");
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str4));
	}
}