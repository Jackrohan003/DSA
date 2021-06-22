package com.practice;

import java.util.HashSet;

public class FindDuplicateNumberInArray {

	public static void main(String[] args) {
		int nums[] = {2,1,4,3,5,3};
		
		System.out.println(findDuplicateUsingHashset(nums));
	}
	
	//TC O(n) SC O(n)
	public static int findDuplicateUsingHashset(int nums[]) {
		
		HashSet<Integer> duplicate = new HashSet<>();
		
		for(int i:nums) {
			if(duplicate.contains(nums[i]))
				return nums[i];
			duplicate.add(nums[i]);
		}
		
		return -1;
	}
	
	//TC O(n) SC O(1)
	//Linkedlist cycle Detection approach
	 public static int findDuplicate(int[] nums) {
		    
         if(nums.length ==0 )
                return 0;
            int slow=0, fast=0;
            slow = nums[slow];
            fast = nums[nums[fast]];
            while(slow != fast){
                if(slow == nums[slow])
                    return slow;
                slow = nums[slow];
                fast = nums[nums[fast]];
            }
            fast = 0;
            while(slow != fast){
                if(slow == nums[slow])
                    return slow;
                slow = nums[slow];
                fast = nums[fast];
            }
            return slow;    
        
    }

}
