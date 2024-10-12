package Arrays;

import java.util.Arrays;

public class ProductExceptSelf {

	/*
	 
	 Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 
	  */
	
	public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // Result array to store the product except self
        int[] result = new int[n];
        
        // Step 1: Calculate the product of all elements to the left of each element
        result[0] = 1;  // There are no elements to the left of the first element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate the product of all elements to the right of each element
        // and update the result array
        int rightProduct = 1;  // Initialize right product as 1 (since there are no elements after the last one)
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;  // Multiply the left product with the right product
            rightProduct *= nums[i];  // Update the right product for the next element (moving left)
        }

        return result;
    }
	
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};

        // Get the product of array except self
        int[] result = productExceptSelf(nums);

        // Print the result
        System.out.println("Product of array except self: " + Arrays.toString(result));

	}

}
