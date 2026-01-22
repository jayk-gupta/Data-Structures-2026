package LeetCode.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//NOT SOLVE WRONG LOGIC
public class KMostFrequent {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        int k = 2;
        int[] ans = topKFrequent(nums, k);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                m.put(nums[i], m.get(nums[i]) + 1);
            } else {
                m.put(nums[i], 1);
            }
        }
//        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            if(entry.getValue() == k) list.add(entry.getKey());
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i); // auto-unboxing
        }

        return arr;
    }
}
