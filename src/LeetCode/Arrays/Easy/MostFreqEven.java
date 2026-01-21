package LeetCode.Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class MostFreqEven {
    public static void main(String[] args) {
       int[] nums = {0,1,2};
        System.out.println(mostFrequentEven(nums));
    }
    public static int mostFrequentEven(int[] nums) {
        int maxFreq = -1;
        int ans = -1;
        HashMap<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
//            skip odd numbers
            if(nums[i]%2 !=0) continue;
            if(m.containsKey(nums[i])){
                m.put(nums[i],m.get(nums[i])+1);
            }else{
                m.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if( entry.getValue()> maxFreq) {
                maxFreq = entry.getValue();
                ans = entry.getKey();
            }
            else if(entry.getValue() == maxFreq){
                ans = Math.min(ans,entry.getKey());
            }
        }
        return ans;
    }
}
