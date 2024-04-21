package hashtables;

import java.util.HashMap;

public class ContainsDuplicatesII {
    public static void main(String[] args) {
        int[] arr = { -1, -1 };

        int k = 1;
        boolean res = hasDuplicates_O(arr, k);
        System.out.println(res);
    }

    public static boolean hasDuplicates_B(int[] arr, int k) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && (i - j) <= k)
                    return true;
            }
        }
        return false;
    }

    public static boolean hasDuplicates_O(int[] arr, int k) {

        // Base case
        if (arr == null || k == 0)
            return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) && Math.abs(i - map.get(arr[i])) <= k) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
}
