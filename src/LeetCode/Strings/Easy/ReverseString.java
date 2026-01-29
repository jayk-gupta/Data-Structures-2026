package LeetCode.Strings.Easy;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
