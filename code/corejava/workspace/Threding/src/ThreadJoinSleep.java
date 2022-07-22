public class ThreadJoinSleep {
	public static void main(String[] args) {
		System.out.println("Main THread started.");
		
		CustomThread th = new CustomThread();
		th.start();
		
		th.suspend();
		
		/*
		 * try { th.join(); } catch (InterruptedException e) { e.printStackTrace(); }
		 */
		
		System.out.println("Main THread Ends.");
		th.resume();
	}
}
class CustomThread extends Thread
{
	public void run() {
		System.out.println("Custom THread started.");
		for(int i = 1; i<=10;i++) {
			
			System.out.println("i : " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Custom THread Ends.");
	}
}
