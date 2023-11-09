package ProblemsOnArrays.RotateMatrix.bruteForce;
public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int n = arr.length;

        int[][] ans = rotateMatrix(arr, n);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Function name: rotateMatrix()
     *
     * @param arr (int[][])
     * @param n (int)
     *
     * Inside function : rotates the matrix 90deg
     */
    public static int[][] rotateMatrix(int[][] arr, int n) {

        int[][] rotatedMatrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                rotatedMatrix[j][n - i - 1] = arr[i][j];
            }
        }
        return rotatedMatrix;
    }
}
