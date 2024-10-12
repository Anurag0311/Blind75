package Arrays;

import java.util.HashMap;

public class TwoSum {
	/*
	 * Problem Statement: Given an array of integers arr[] and an integer target.
	 

	1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

	2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

	Note: You are not allowed to use the same element twice. Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.

	Examples:

	Example 1:
	Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
	Result: YES (for 1st variant)
	       [1, 3] (for 2nd variant)
	Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

	Example 2:
	Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
	Result: NO (for 1st variant)
		[-1, -1] (for 2nd variant)
	Explanation: There exist no such two numbers whose sum is equal to the target.
	
	*/
	
	public String twoSum(int[] array, int target) {
	    // Initialize the sum variable (though it's unused and unnecessary in this context)
	    int sum = 0;

	    // Outer loop: iterate through each element in the array except the last one
	    for (int i = 0; i < array.length - 1; i++) {
	        
	        // Inner loop: start from the next element (i+1) to avoid using the same element twice
	        for (int j = i + 1; j < array.length; j++) {
	            
	            // Check if the sum of the two numbers equals the target
	            if (array[i] + array[j] == target)
	                return "YES";  // If the target sum is found, return "YES"
	        }
	    }

	    // If no such pair is found after checking all combinations, return "NO"
	    return "NO";
	}
	
	
//	Using Hashing
	public String twoSum1(int[] array, int target) {
	    // Create a HashMap to store the elements of the array as keys and their indices as values
	    HashMap<Integer, Integer> hmp = new HashMap<>();
	    
	    // Loop through each element of the array
	    for (int i = 0; i < array.length; i++) {
	        // Calculate the difference needed to reach the target sum
	        int diff = target - array[i];
	        
	        // Check if this difference has already been encountered in the array
	        if (hmp.containsKey(diff)) {
	            // If the difference is found in the map, a valid pair exists, so return "YES"
	            return "YES";
	        } else {
	            // If the difference is not found, store the current element in the HashMap
	            // The element value is the key, and its index is the value
	            hmp.put(array[i], i);
	        }
	    }
	    
	    // If no pair sums to the target after checking all elements, return "NO"
	    return "NO";
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {2,6,5,8,11};
		int target = 14;
		TwoSum uos = new TwoSum();
		System.out.println(uos.twoSum(arr, target));
		System.out.println(uos.twoSum1(arr, target));

	}

}
