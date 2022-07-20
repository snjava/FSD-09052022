
public class ThreadIntro {
	public static void main(String[] args) {
		Thread th = Thread.currentThread(); // returns the object of currently executing thread.
		System.out.println(th); // Thread[main,5,main]
		
		MyThread myTh = new MyThread(); // New Stage
		myTh.setName("My-Thread");
		myTh.setPriority(10);
		myTh.start(); // Runnable Stage
	}
}
class MyThread extends Thread
{
	@Override
	public void run() { // Running Stage
		System.out.println("Start of custom thread");
		Thread th = Thread.currentThread();
		System.out.println("Custom THread  : "+ th);
		System.out.println("End of custom thread");
	}
}
