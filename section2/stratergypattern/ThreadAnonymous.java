package lambdas_streams_ajayIyengar.section2.stratergypattern;

public class ThreadAnonymous {
	public static void main(String[] args) {
		
		// Start a thread using anonymous class.
		//Runnable r = Instance of class which implements Runnable
	
		Thread t = new Thread(new Runnable() {
			public void run() {
				performLongRunningOperation();
			}
		});
		// Thread t = new Thread(new MyThread());
		
		t.start();
	
	}
	
	private static void performLongRunningOperation() {
		System.out.println("This is a long running operation...");
	}

}

class MyThread implements Runnable{
	public void run() {
		System.out.println("This is another long running operation...");

	}
}

	


