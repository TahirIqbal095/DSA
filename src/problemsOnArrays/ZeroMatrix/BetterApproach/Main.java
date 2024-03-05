package problemsOnArrays.ZeroMatrix.BetterApproach;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 5, 9)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 7)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 5, 2)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        int[] row = new int[n];
        int[] col = new int[m];

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m, row, col);

        for(ArrayList<Integer> r : ans) {
            for(Integer el : r) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    /**
     * Function name : zeroMatrix()
     *
     * @param matrix (ArrayList<ArrayList<Integer>>)
     * @param n (int)
     * @param m (int)
     * @param row (int[])
     * @param col (int[])
     * @return (ArrayList<ArrayList<Integer>>)
     *
     * Inside the function : if an element in the matrix is zero, entire row and column is set to zero.
     *
     */

    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m, int[] row, int[] col) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix.get(i).get(j) == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }
}
