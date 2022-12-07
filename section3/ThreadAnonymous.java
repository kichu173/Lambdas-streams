package lambdas_streams_ajayIyengar.section3;

public class ThreadAnonymous {
	public static void main(String[] args) {
		
		// Start a thread using anonymous class.
		//Runnable r = Instance of class which implements Runnable
	
//		Thread t = new Thread(new Runnable() {
//			public void run() {
//				performLongRunningOperation();
//			}
//		});
		// Thread t = new Thread(new MyThread());

		// lambda expressions are compatible onl with functional interfaces(@FunctionalInterface - introduced in java8)
		//functional interfaces are interfaces which has only one abstract method.
		Thread t = new Thread(() -> performLongRunningOperation());
		
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

	


