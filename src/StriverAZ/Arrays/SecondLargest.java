package StriverAZ.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {1,2,5,8,12,20};
        System.out.println(findSecondLargest(nums));
    }
    static int findSecondLargest(int[] nums){
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>largest){
                secondLargest = largest;
                largest = nums[i];

            }

        }
        return secondLargest;
    }
}
