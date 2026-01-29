package LeetCode.Arrays.Easy;

public class Sqrt {
    public static void main(String[] args) {
        int x = 32;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
// We compare mid with (x / mid) instead of checking (mid * mid)
// because mid * mid can overflow the integer range for large values of x.
// Division avoids overflow and keeps the comparison safe while preserving
// the same logical meaning:
//   mid * mid == x   ⇔   mid == x / mid
//   mid * mid > x    ⇔   mid > x / mid
        int start = 1, end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid)
                return mid;
            else if (mid > x / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
