package trywithresources;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		System.out.println("Starting");
		
		OpenClose oc = new OpenClose("OpenClose1");
		
		// We can use try-with-resources with any class that implements AutoCloseable
		try (OpenClose oc2 = new OpenClose("OpenClose2")) {
			System.out.println("In try block");
			// oc2 will be automatically closed here
		}
		catch (Exception e) {
			System.out.println("In catch block");
		}
		finally {
			System.out.println("In finally block");
		}
		
		// oc1 isn't closed automatically, so we have to do it here
		oc.close();
		System.out.println("End");
	}
}
