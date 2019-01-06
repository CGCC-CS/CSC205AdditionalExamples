package javareview;

public class Arrays {

	public static void main(String[] args) {
		Integer[] nums = new Integer[10];
		Integer[] moreNums = {10, 20, 30};
		
		// add numbers to nums array
		for (int ii=0;ii<nums.length;ii++) {
			nums[ii] = ii;
		}
		
		// Change 5th element of nums - keep in mind the first element is stored
		//  in nums[0], so the 5th is in nums[4]
		nums[5] = 30;
		
		// print the nums array - on one line separated by a space
		System.out.println("nums:");
		// When traversing through an array, use the length attribute instead of
		//  a hard-coded number
		for(int ii=0;ii<nums.length;ii++) {
			System.out.print(nums[ii] + " ");
		}
		System.out.println("\n");

		// print the moreNums array, one number per line
		System.out.println("moreNums:");
		for(int ii=0;ii<moreNums.length;ii++) {
			System.out.println(moreNums[ii]);
		}
		System.out.println();
		
	}

}
