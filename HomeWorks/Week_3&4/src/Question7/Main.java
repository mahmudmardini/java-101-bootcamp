package Question7;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		oddAndEvenNumbers q7 = new oddAndEvenNumbers();
		
		Thread1 thread1 = new Thread1();
		thread1.start();
		
		Thread2 thread2 = new Thread2();
		thread2.start();
		
		Thread3 thread3 = new Thread3();
		thread3.start();
		
		Thread4 thread4 = new Thread4();
		thread4.start();

		
	}

}
