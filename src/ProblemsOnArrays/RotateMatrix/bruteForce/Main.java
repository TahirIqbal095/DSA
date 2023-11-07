package ProblemsOnArrays.RotateMatrix.bruteForce;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        arr.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        arr.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> ans = rotateMatrix(arr);

        for(ArrayList<Integer> ar : ans) {
            for(Integer el : ar) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    /**
     * Function name: rotateMatrix()
     *
     * @param arr (ArrayList<ArrayList<Integer>>)
     * @return (ArrayList<ArrayList<Integer>>)
     *
     * Inside function : rotates the matrix 90deg
     */
    public static ArrayList<ArrayList<Integer>> rotateMatrix(ArrayList<ArrayList<Integer>> arr) {

        ArrayList<ArrayList<Integer>> rotated = new ArrayList<>(3);

        int n = arr.size();
        int m = arr.get(0).size();

        for(int i = 0; i < n; i++) {
            rotated.add(new ArrayList<>());
            for(int j = 0; j < m; j++) {
                rotated.get(i).add(0);
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                rotated.get(j).set((n - i - 1), arr.get(i).get(j));
            }
        }

        return rotated;
    }
}
