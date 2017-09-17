public class MutableInteger {
	private int i = 0;
	public int get() {
		return i;
	}

	public void set(int i) {
		this.i = i;
	}

	public void increment() {
		this.i++;
	}
}
