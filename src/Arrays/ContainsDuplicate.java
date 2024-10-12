package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

/*

Contains Duplicate : Check if a value appears atleast twice

Problem Statement: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example:

Example 1:
Input: nums = [1, 2, 3, 1]
Output: true.
Explanation: 1 appeared two times in the input array.

Example 2: 
Input: nums = [1, 2, 3, 4]
Output: false
Explanation: input array does not contain any duplicate number.

*/


public class ContainsDuplicate {

	// Method to check if the array contains any duplicate elements
    public static boolean containsDuplicate(int[] array) {
        
        // Create a HashSet to store unique elements from the array
        HashSet<Integer> hs = new HashSet<>();
        
        // Iterate through the entire array
        for (int i = 0; i < array.length; i++) {
            
            // If the current element already exists in the HashSet, a duplicate is found
            if (hs.contains(array[i])) {
                return true;  // Duplicate found, so return true
            }
            
            // If it's not a duplicate, add the element to the HashSet
            hs.add(array[i]);
        }
        // If no duplicates are found after iterating through the array, return false
        return false;
    }
		
	    
	    
	    
		public static void main(String[] args) {
		
			int [] nums = {1, 2, 3};
			System.out.println(containsDuplicate(nums));
		
		}

}
