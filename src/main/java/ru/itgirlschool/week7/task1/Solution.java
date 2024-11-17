package ru.itgirlschool.week7.task1;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0};
        int[] result = removeDuplicates(nums);
        System.out.println(Arrays.equals(result, expectedNums));
    }

    public static int[] removeDuplicates(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    for (int k = j; k < len - 1; k++) {
                        nums[k] = nums[k + 1];
                        nums[k + 1] = 0;
                    }
                    len--;
                }
            }
        }
        return nums;
    }
}