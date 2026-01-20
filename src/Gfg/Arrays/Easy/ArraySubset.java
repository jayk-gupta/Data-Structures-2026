package Gfg.Arrays.Easy;

import java.util.HashMap;

public class ArraySubset {
    public static void main(String[] args) {
        int[] a = {11, 7,3,11,11}, b = {11, 3};
        System.out.println(isSubset(a, b));
    }

    public static boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (m.containsKey(a[i])) {
                m.put(a[i], m.get(a[i]) + 1);
            } else {
                m.put(a[i], 1);
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (m.containsKey(b[i])) {
                if (m.get(b[i]) == 0 ) return false;
                m.put(b[i], m.get(b[i]) - 1);

            } else {
                return false;
            }
        }
        return true;
    }
}
