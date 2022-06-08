public class EvenOddNumber
{
	public static void main(String ar[])
	{
		System.out.println("======Even Number========");
		for(int i = 2 ; i<=100 ; i+=2) 
		{
				System.out.println(i);
		}

		System.out.println("======Odd Number========");
		int num = 1;
		do
		{
			if( num % 2 != 0)
			{
				System.out.println(num);
			}
			num++;
		} 
		while(num <= 100);
	}
}