package javareview;

public class Functions {

	// Example of a function - since we are calling it without instantiating 
	//  an object it has to be static.
	// Print the numbers up to n
	public static void print_numbers(int n) {
		for(int ii=1;ii<=n;ii++) {
			System.out.print(ii + " ");  // the space keeps the numbers separate
		}
		System.out.println();
	}
	
	// Example of a function that returns a value
	// Print the sum of an integer array
	public static int sumArray(Integer[] numbers) {
		int sum = 0;
		for(int ii=0;ii<numbers.length;ii++) {
			sum = sum + numbers[ii];	
		}
		return sum; 
	}
	
	
	public static void main(String[] args) {
		Integer nums[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Print numbers up to 10:");
		print_numbers(10);

		System.out.println("\nThe sum of the array is " + sumArray(nums));
	}

}
