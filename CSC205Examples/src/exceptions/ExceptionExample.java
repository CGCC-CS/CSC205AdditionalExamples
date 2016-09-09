package exceptions;

public class ExceptionExample {
	public static void main(String args[]) {
		System.out.println("START");

		System.out.println("Valid input:");
		doExample(10);

		System.out.println("\nInvalid example:");
		doExample(-10);
		System.out.println("END");
	}

	public static void doExample (Integer num) {
		System.out.println("\tdoExample START");
		try {
			checkNumber(num);
			System.out.println("\t\tdoExample valid argument");
		} catch (IllegalArgumentException e) {
			System.out.println("\t\tdoExample EXCEPTION: illegal argument");
			return;  // finally block will run even with this return
		}
		finally {
		System.out.println("\t\tdoExample finally block");
		}
		System.out.println("\tdoExample END");
	}

	public static void checkNumber (Integer num) {
		System.out.println("\t\tSTART checkNumber No exception in example");
		if (num < 0) {
			throw new IllegalArgumentException();
		}
		System.out.println("\t\tEND checkNumber No exception in example");
	}
	
}
