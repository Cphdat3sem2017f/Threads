/* Idea and code taken almost as is from example code by Peter Sestoft at the
 * ITU
 */

import java.io.IOException;
public class VolatileExample {
	public static void main(String[] args) throws IOException{
		MutableInteger mi = new MutableInteger();

		Thread t1 = new Thread(() -> {
			while (mi.get() == 0) {}
			System.out.println("String changed, thread terminating");
		});

		t1.start();

		System.out.println("Hit enter to change string");
		System.in.read();
		mi.set(42);
	}
}

