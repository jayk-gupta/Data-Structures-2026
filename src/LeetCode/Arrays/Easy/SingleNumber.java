package LeetCode.Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumberXor(nums));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
// “If nums[i] exists in the map, give me its value.
//If it does NOT exist, give me 0.”
          m.put(nums[i], m.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
    public static int singleNumberXor(int[] nums) {
//  a ^ a = 0
//2️⃣ a ^ 0 = a
//3️⃣ XOR is commutative & associative
        int ans = 0;
        for (int num: nums){
            ans = ans^num;
        }
        return ans;
    }
}
