package hashtables;

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumIndexSum {
    public static void main(String[] args) {
        String[] list1 = { "happy", "sad", "good" };
        String[] list2 = { "sad", "happy", "good" };

        String[] result = minIndexSum(list1, list2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static String[] minIndexSum(String[] list1, String[] list2) {

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) { // checks whether key is present in map(list1) or not
                int indexSum = map.get(list2[j]) + j;

                if (min > indexSum) {
                    result.add(list2[j]);
                    min = indexSum;
                } else if (min == indexSum) {
                    result.add(list2[j]);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
