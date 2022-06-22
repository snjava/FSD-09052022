public class StringDemo4
{
	public static void main(String args[])
	{
		String str1 = "Hello Java String";
		System.out.println(str1); 

		String arr[] = str1.split(" "); // Hello(0)		Java(1)			String(2)
		
		for(int i = arr.length-1 ; i>=0 ; i--) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();


		String str2 = "Welcome";
		System.out.println(str2);
		char ch[] = str2.toCharArray(); // W(0)	e(1)	l(2)	c(3)	o(4)	m(5)	e(6)
		for(int i = ch.length-1 ; i>=0 ; i--) 
		{
			System.out.print(ch[i]);
		}
		System.out.println();
	}
}