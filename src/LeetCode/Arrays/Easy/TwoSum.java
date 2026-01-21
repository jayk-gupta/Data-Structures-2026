package LeetCode.Arrays.Easy;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 20, 34, 18};
        int target = 20;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (m.containsKey(complement)) {
                return new int[]{i, m.get(complement)};
            } else {
                m.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
