
public class SynchronizationDemo {
	public static void main(String[] args) {
		Printer print = new Printer();
		
		Thread1 t1 = new Thread1(print);
		Thread2 t2 = new Thread2(print);
		t1.start();
		t2.start();
	}
}
// Thread - 1
class Thread1 extends Thread {
	Printer print;
	public Thread1(Printer print) {
		this.print = print;
	}
	public void run() {
		print.printTable(15);
	}
}

//Thread - 2
class Thread2 extends Thread {
	Printer print;
	public Thread2(Printer print) {
		this.print = print;
	}
	public void run() {
		print.printTable(20);
	}
}

class Printer {
	public void printTable(int number) {
		synchronized (this) {
			for(int i = 1 ; i<=10 ; i++) {
				System.out.println(number + " * " + i + " = " + number*i);
			}
		}
	}
}
