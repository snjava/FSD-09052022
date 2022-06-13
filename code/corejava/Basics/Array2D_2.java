import java.util.Scanner;
public class Array2D_2
{
	public static void main(String ar[])
	{
	//create an array which contains 20 student id. 34,56,78,98,45,67,87,45,65,56,79,64,34,68,91
		int id1[] = {34,56,78,98,45,67,87,45,65,56,79,64,34,68,91};
		
		for(int x = 0 ; x<id1.length ; x++) {
			System.out.println(id1[x]);
		}

		System.out.println("=================================================");

		//create an array which contains 20 student id. get the ids from the user at runtime
		int id2[] = new int[20];
		Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i < id2.length ; i++) {
			System.out.println("Enter Value " + (i+1));
			id2[i] = scan.nextInt();
		}

		System.out.println("=====User Values==========");

		for(int x = 0 ; x<id2.length ; x++) {
			System.out.println(id2[x]);
		}
	}
}