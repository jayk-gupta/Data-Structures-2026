package LeetCode.Arrays.Easy;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 289;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num) return true;
            else if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
