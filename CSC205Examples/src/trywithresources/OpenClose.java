package trywithresources;

public class OpenClose implements AutoCloseable {

	private String label;
	
	public OpenClose(String l) {
		label = l;
		System.out.println("   Opening : " + label);
	}

	@Override
	public void close() {
		System.out.println("   Closing : " + label);
	}

}
