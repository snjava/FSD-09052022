import java.util.Scanner;

public class ThrowAndThrows {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int val1 = scan.nextInt();
			divide(val1, 0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			scan.close();
		}
	}

	public static void divide(int a, int b) throws Exception, ArrayIndexOutOfBoundsException{
		if (b == 0) {
			throw new Exception("Not a valid Operation...");
		}
		System.out.println("Div : " + (a / b));

	}

}
