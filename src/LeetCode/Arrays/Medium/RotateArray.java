package LeetCode.Arrays.Medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;
        k = k % n;
// rotate from 0 to k
        rotateArray(nums, 0, n - k - 1);
// rotate from k+1 to array end
        rotateArray(nums, n-k, n - 1);
// rotate whole array
        rotateArray(nums, 0, n - 1);

    }

    public static void rotateArray(int[] nums, int s, int e) {
        int temp = 0;
        while (s < e) {
            temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}
