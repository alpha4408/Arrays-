package com.apsucodes.datastructures;

import java.util.Arrays;

class Solution {
    static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {

                if (nums[i] == nums[i-1])return nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5,6,6,7};
        findDuplicate(nums);
    }
}
