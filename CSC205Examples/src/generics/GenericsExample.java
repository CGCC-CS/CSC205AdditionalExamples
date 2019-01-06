package generics;

public class GenericsExample {

	public static void main(String[] args) {
		
		// Instantiate things with a type (will replace T in the class)
		Thing<Integer> thing1 = new Thing<Integer>(1, 5);
		Thing<String> thing2 = new Thing<String>("Hello", 10);
		
		System.out.println("Thing 1: " + thing1);
		System.out.println("Thing 2: " + thing2);
		
		System.out.println("\nareSame() testing"); 
		areSame(1, 2);
		areSame(5, 5);
		areSame("Hello", "World");
		areSame("CGCC", "CGCC");
	}

	
	// Generic method
	public static <T> void areSame(T a, T b) {
		if (a.equals(b)) {
			System.out.println(a + " and " + b + " are the same");
		}
		else {
			System.out.println(a + " and " + b + " are NOT the same");
		}
		
	}
}
