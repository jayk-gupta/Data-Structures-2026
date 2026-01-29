package LeetCode.Arrays.Easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(122));
    }
    public static boolean isPalindrome(int x) {
        int q=0,r=0,rev=0;
        int original = x;
        while(x>0){
            r = x%10;
            rev=rev*10+r;
            x=x/10;
        }
        return original == rev;
    }
}
