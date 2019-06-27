package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * -Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * -You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Difficulty: Easy
 * Related Topics: Array, Hash Table
 * 
 * @author 吴星辉
 * @date 2019-6-25
 */
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	/**
	 * @param nums
	 * @param target
	 * @return indices
	 * @version 1.0
	 */
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> elements = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
        	int complement = target - nums[i];
        	if(elements.containsKey(complement))
        		return new int[]  {elements.get(complement), i};
        	elements.put(nums[i], i);
        }
        return null;
    }

}
