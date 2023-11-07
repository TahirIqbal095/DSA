package ProblemsOnArrays.RotateMatrix.optimal;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 9, 2}, {4, 9, 7, 6}, {5, 1, 2, 0}, {1, 0, 9, 3}};
        int n = arr.length;
        int m = arr[0].length;

        System.out.println("Original matrix : ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        rotateMatrix(arr, n, m);

        System.out.println("After rotating 90deg :");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Function name : rotateMatrix()
     *
     * @param arr (int[][])
     * @param n (int)
     * @param m (int)
     *
     *          Inside function : rotates the matrix by 90deg
     */
    public static void rotateMatrix(int[][] arr, int n, int m) {

        for(int i = 0; i < n; i++) {
            for(int j = i; j < m; j++) {
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }

    }
}
