package problemsOnArrays.RotateMatrix.optimal;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 9, 2}, {4, 9, 7, 6}, {5, 1, 2, 0}, {1, 0, 9, 3}};
        int n = arr.length;

        System.out.println("Original matrix : ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        rotateMatrix(arr, n);

        System.out.println("After rotating 90deg :");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
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
     *
     * Inside function : rotates the matrix by 90deg
     */
    public static void rotateMatrix(int[][] arr, int n) {

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }

    }
}
