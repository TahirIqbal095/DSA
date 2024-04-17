package hashtables;

import java.util.HashSet;
import java.util.*;

public class SingleNum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 3, 1, 10 };

        String ans = singleNumber(arr);
        int ans2 = singleNumber2(arr);

        System.out.println(ans);
        System.out.println(ans2);
    }

    public static String singleNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (Integer num : arr) {

            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        try {
            return "Single number in an array is " + set.iterator().next();
        } catch (Exception e) {
            return "No duplicates in an array";
        }

    }

    public static int singleNumber2(int[] arr) {
        int res = 0;

        for (Integer num : arr) {
            res ^= num;
        }
        return res;
    }
}
