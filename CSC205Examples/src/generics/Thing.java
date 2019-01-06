package generics;

// Generic class - T is a generic type that will be defined at compile time
public class Thing<T> {
	
	private T thing;
	private int count;

	public Thing(T thing, int count) {
		super();
		this.thing = thing;
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Thing [thing=" + thing + ", count=" + count + "]";
	}
}
