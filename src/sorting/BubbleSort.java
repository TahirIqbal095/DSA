package sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int x = scan.nextInt();

        int[] arr = new int[x];
        System.out.print("Enter the array Elements : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        sortArr(arr);
        System.out.print("The sorted array will be : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortArr(int[] arr) {
        int n = arr.length;

        for(int i = n - 1; i >= 1; i--) {
            for(int j = 0; j <= i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+ 1];
                    arr[j + 1] = temp;
                }
            }
        } 
    }
}
