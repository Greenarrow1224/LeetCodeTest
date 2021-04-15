package com.greenarrow.solution;

/**
 * @Description: 删除排序数组中的重复项
 * @Author GreenArrow
 * @Date: 2021/4/15 15:57
 * @Version 1.0
 */
public class RemoveDuplicate {

    public int RemoveDuplicates(int[] nums){
        if (nums.length == 0){
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }

        }
        return i+1;
    }

    public static void main(String[] args) {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int[] nums = new int[]{1,2,3,3};
        int i = removeDuplicate.RemoveDuplicates(nums);
        System.out.println(i);
        for (int k = 0; k < i; k++) {
            System.out.println(nums[k]);
        }
    }

}
