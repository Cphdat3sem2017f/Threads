public class PrintStuff {
	public static void main(String[]args) {
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 1e5; i++) {
				System.out.println("t1: " + i);
			}
		});

		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 1e5; i++) {
				System.out.println("t2: " + i);
			}
		});

		//These will run at the same time, and the outputs should interleave.
		//Cool stuff!
		t1.start();
		t2.start();
	}
}
