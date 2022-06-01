public class ShortCircuitOpt
{
	public static void main(String arg[])
	{
		int a = 10;
		int b = 11;
		
		System.out.println((a>10) && (b<=10)); // false
		System.out.println((a>=10) || (b<=10)); // 



		int x = 12; 
		int y = 18;

		System.out.println((x>=10) && (y>10)); // true
		System.out.println((y>=10) || (x<=10)); // true
      	System.out.println(!(y>=10) || (x<=10)); // false

	}
}










