package LeetCode.Strings.Easy;

public class ValidPalindrome {
    public static void main(String[] args) {
      String  s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {

// remove spaces and convert to lowercase
//        Match any ONE character that is NOT
//A–Z, a–z, or 0–9 | ✔ Matches: @ # $ % space _ !
        String str = s.replaceAll(" ","").toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int i=0, j = str.length()-1;
      while (i< str.length()/2){
          if(str.charAt(i) != str.charAt(j)) return false;
          i++;
          j--;
      }
        System.out.println(str);
        return true;
    }
}
