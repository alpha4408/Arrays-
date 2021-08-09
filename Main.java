package com.apsucodes.datastructures;

public class Main {

    public static void main(String[] args) {
	int [] nums = {1,2,3,3,4,5};

	int left = 0;
	int right = nums.length -1;


	while(left < right){
	    if(nums[left] < nums[right]){
	        left++;

        }if (nums[left] > nums[right]){
            right--;
            {
                if(nums[left] == nums[right]){
                    System.out.println(nums[left]);
                }

        }
        }

    }
    }
}
