import java.util.InputMismatchException;
import java.util.Scanner;
// First Middle Last
public class ExceptinoStructure {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter Value : ");
			String val = scan.nextLine();
			
			System.out.println("Enter Start Position : ");
			int startPos = scan.nextInt(); 
			
			System.out.println("Enter End Position : ");
			int endPod = scan.nextInt();
			
			String str = val.substring(startPos, endPod);
			System.out.println("String Value : " + str);
		}
		catch(Exception e) {
			// code
			System.out.println("Got Exception");
		}
		
	} 
}
