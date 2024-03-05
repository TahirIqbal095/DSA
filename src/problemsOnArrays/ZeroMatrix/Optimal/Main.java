package problemsOnArrays.ZeroMatrix.Optimal;

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

    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int col0 = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix.get(i).get(j) == 0) {
                    // mark the i-th row
                    matrix.get(i).set(0, 0);
                    // mark the j-th col
                    if(j != 0)
                        matrix.get(0).set(j, 0);
                    else
                        col0 = 0;
                }
            }
        }

        // mark with 0 from (1,1) to (n-1, m-1)
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(matrix.get(i).get(j) != 0) {
                    if(matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }

        // finally mark the first col and first row
        if(matrix.get(0).get(0) == 0) {
            for(int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }

        if(col0 == 0) {
            for(int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }
}
