package arrays.SpiralMatrix;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        arr.add(new ArrayList<>(Arrays.asList(8, 9, 4)));
        arr.add(new ArrayList<>(Arrays.asList(7, 6, 5)));

        ArrayList<Integer> ans = SpiralMat(arr);

        for (Integer el : ans) {
            System.out.print(el + " ");
        }
    }

    public static ArrayList<Integer> SpiralMat(ArrayList<ArrayList<Integer>> arr) {

        ArrayList<Integer> spiralEl = new ArrayList<>();
        int n = arr.size();
        int m = arr.get(0).size();

        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                spiralEl.add(arr.get(top).get(i));
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                spiralEl.add(arr.get(i).get(right));
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiralEl.add(arr.get(bottom).get(i));
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiralEl.add(arr.get(i).get(left));
                }
                left++;
            }
        }

        return spiralEl;
    }
}
