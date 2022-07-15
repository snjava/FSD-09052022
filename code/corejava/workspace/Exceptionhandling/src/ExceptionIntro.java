import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionIntro {
	public static void main(String[] args) {
		int arr[] = {34,56,4,7,0,2,54,71,87};
		
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter 1st Index : ");
			int index1 = scan.nextInt(); 
			
			System.out.println("Enter 2nd Index : ");
			int index2 = scan.nextInt();
			
			int val1 = arr[index1];
			int val2 = arr[index2];
			
			System.out.println("Add : " + (val1 + val2));
			
			try {
				System.out.println("Div : " + (val1 / val2));
			} catch(ArithmeticException ex) {
				System.err.println("Invliad Math Operation. Cannot divide number by 0.");
			}
			
			System.out.println("Mul : " + (val1 * val2));
			System.out.println("Sub : " + (val1 - val2));
		} catch(InputMismatchException ex ) {
			System.err.println("Invalid Input Provided.. Please enter numeric values only..");
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.err.println("Invalid Index provided..");
		} 
		
		System.out.println("Execution Ends");
		System.out.println("Exit from Main Method");
		
		
	}
}
