public class Array1D_1
{
	public static void main(String args[])
	{
		int a[] = {34,46,65,7,3,44,76,87,42,3,234,76,79,34,34};
		System.out.println("Total Number of values : " + a.length);
		System.out.println("Last Index is : " + (a.length -1));

		for(int i = 0; i<a.length ; i++)
		{
			System.out.println(a[i]);
		}
	}
}