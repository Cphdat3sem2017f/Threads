public class Counter {
	/* Only thread safe if MutableInteger is threadsafe!
	 * Specifically, we need increment to be atomic with respect to itself.
	 */
	public static void main(String[] args) throws InterruptedException {
		MutableInteger mi = new MutableInteger();
		Runnable r = () -> {
			for (int i = 0; i < 1e1; i++) {
				mi.increment();
			}
		};

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
                  
		System.out.println(mi.get());
	}
}
