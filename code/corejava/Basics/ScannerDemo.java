import java.util.Scanner;

public class ScannerDemo
{
	public static void main(String arr[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter User Name : ");
		String name = scan.next(); // to accept the string word

		System.out.println("Enter User Age : ");
		double age = scan.nextDouble(); // to accept the double value.

		System.out.println("Enter 1st Number : ");
		int num1 = scan.nextInt();

		System.out.println("Enter 2nd Number : ");
		int num2 = scan.nextInt();
		
		System.out.println("User Name : " + name);
		System.out.println("User Age : " + age);
		System.out.println("Addition : " + (num1+num2));
	}
}