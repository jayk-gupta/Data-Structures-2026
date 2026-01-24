package LeetCode.Arrays.Easy;

import java.util.Arrays;
//logic wron not mainting relative order
public class MovesZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] == 0) {
//            swap with j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            else{
                i++;
            }
        }
    }
}
