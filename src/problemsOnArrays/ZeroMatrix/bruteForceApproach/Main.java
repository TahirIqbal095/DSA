package problemsOnArrays.ZeroMatrix.bruteForceApproach;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,9,8)));
        matrix.add(new ArrayList<>(Arrays.asList(5,0,7)));
        matrix.add(new ArrayList<>(Arrays.asList(4,3,2)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        for(ArrayList<Integer> row : ans) {
            for(Integer el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    /**
     * Function name: zeroMatrix()
     *
     * @param matrix (ArrayList<ArrayList<Integer>>)
     * @param n (int)
     * @param m (int)
     * @return (ArrayList<ArrayList<Integer>>)
     *
     * inside the function : if the element in a matrix is zero entire row and column is set to zero
     */

    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix.get(i).get(j) == 0) {
                    markRow(matrix, m, i);
                    markCol(matrix, n, j);
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }

    /**
     * Function name : markRow()
     *
     * @param matrix (ArrayList<ArrayList<Integer>>)
     * @param m (int)
     * @param i (int)
     *
     * inside the function : marks all elements in a row to -1
     */
    public static  void markRow(ArrayList<ArrayList<Integer>> matrix, int m, int i) {
        for(int j = 0; j < m; j++) {
            if(matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    /**
     * Function name : markRow()
     *
     * @param matrix (ArrayList<ArrayList<Integer>>)
     * @param n (int)
     * @param j (int)
     *
     * inside the function : marks all elements in a row to -1
     */
    public static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int j) {
        for(int i = 0; i < n; i++) {
            if(matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }
}
