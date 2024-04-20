package hashtables;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = { 2, 7, 11, 15 };
        int target = 17;

        int[] res = new int[2];
        res = twoSum(num, target);

        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] twoSum(int[] arr, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];

            if (map.containsKey(target - el)) {
                res[0] = map.get(target - el);
                res[1] = i;

                return res;
            } else
                map.put(el, i);
        }

        return res;
    }
}
