package LeetCode.Strings.Easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"beast", "", ""};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int len = Math.min(strs[0].length(), strs[strs.length - 1].length());
        StringBuilder sb = new StringBuilder();
        String s1 = strs[0],s2 = strs[strs.length-1];
        for (int i = 0; i < len; i++) {
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
            else{
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
