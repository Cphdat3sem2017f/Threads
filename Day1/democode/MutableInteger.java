public class MutableInteger {
	//Can be made visible by using the volatile keyword,
	//or by only accessing it through synchronized blocks.
	//(reading and writing classes will need to use the same lock, if we want it to guarantee visibility,
	//even though we don't need to lock in the get method for atomicity)
	private int i = 0;
	public int get() {
		return i;
	}

	public void set(int i) {
		this.i = i;
	}

	//Can be made thread safe wrt itself with the synchronized keyword
	public void increment() {
			this.i++;
	}
}
