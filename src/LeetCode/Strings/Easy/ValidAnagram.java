package LeetCode.Strings.Easy;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagarat";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> m = new HashMap<>();
        if(s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(m.containsKey(c)){
                if(m.get(c) == 0) return false;
                m.put(c,m.get(c)+1);
            }else{
                m.put(c,1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(m.containsKey(c)){
                m.put(c,m.get(c)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
