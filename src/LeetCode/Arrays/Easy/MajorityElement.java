package LeetCode.Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           if (m.containsKey(nums[i])){
                m.put( nums[i],m.get(nums[i])+1);
            }
            else{
                m.put(nums[i],1);
           }
        }
//        (Map.Entry<Integer, String> entry : map.entrySet())
        for(Map.Entry<Integer,Integer> entry: m.entrySet()){
            if(entry.getValue() > nums.length/2) return entry.getKey();
        }
        return -1;
    }
}
