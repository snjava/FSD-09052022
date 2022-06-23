public class CommandLineArgs
{
	public static void main(String arr[])
	{
		System.out.println("User Name : " + arr[0]);
		System.out.println("User Age  : " + arr[1]);
		System.out.println("Number 1  : " + arr[2]); // "11"
		System.out.println("Number 2  : " + arr[3]); // "12"
		System.out.println(arr[2] + arr[3]); // "11" + "12" = 1112

		int num1 = Integer.parseInt(arr[2]);
		int num2 = Integer.parseInt(arr[3]);

		System.out.println(num1 + num2);
	}
}