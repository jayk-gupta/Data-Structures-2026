package StriverAZ.Arrays;

public class LargestNum {
    public static void main(String[] args) {
        int[] nums = {1,2,9,11,21,45,38};
        System.out.println(findSecondLargestNum(nums));
    }
    public static int findLargestNum(int[] nums){
        int max= Integer.MIN_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
    public static int findSecondLargestNum(int[] nums){
        int max1= Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i <nums.length ; i++) {
//            Case 1: found a new largest
            if(nums[i]>max1){
//          set previous largest as max 2 and current element as largest as max1
                max2=max1;
                max1 = nums[i];

            }
//      Element is not largest but can be second largest
            else if(nums[i]>max2 && nums[i]!= max1) max2 = nums[i];
        }
        return max2;
    }

}
