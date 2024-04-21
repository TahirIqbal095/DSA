package hashtables;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1, 2 };
        int[] arr2 = { 2, 2 };

        int[] res = intersectionOfArrays(arr1, arr2);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] intersectionOfArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j])
                i++;
            else if (arr2[i] > arr2[j])
                j++;
        }
        int[] result = new int[list.size()];
        for (int k = 0; k < result.length; k++) {
            result[k] = list.get(k);
        }
        return result;
    }
}
