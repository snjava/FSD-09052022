public class StringDemo3
{
	public static void main(String args[])
	{
		String s1 = "Hello";
		String s2 = " Java";

		System.out.println(s1.concat(s2)); // Hello Java
		System.out.println(s1 + s2); // Hello Java

		System.out.println("Original Value : " + s1);
		String s3 = s1.toUpperCase(); // HELLO
		System.out.println(s3);
		System.out.println(s1.toLowerCase());
		
		String s4 = s1 + s2;
		System.out.println(s4);

		System.out.println(s4.length());

		String s5 = "This is Java. String class is Java class.";
		System.out.println(s5.replaceAll("Java","c++"));
		System.out.println(s5);

		String s6 = "image.jpg";
		System.out.println(s6.endsWith(".jpg"));
		System.out.println(s6.startsWith(".jpg"));

		System.out.println(s6.charAt(4));
		System.out.println(s6.indexOf('j'));
		
		String s7 = "       ";
		System.out.println(s7.isEmpty());
		System.out.println(s7.isBlank()); / JDK 11 and Above version

		
	}
}