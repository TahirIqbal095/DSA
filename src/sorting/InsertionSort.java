package sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int x = scan.nextInt();

        int[] arr = new int[x];
        System.out.print("Enter the elements of an array : ");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        SortArr(arr);

        System.out.print("The sorted array will be : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
     }

     public static void SortArr(int[] arr) {

        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            j = i;

            while(j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
     }
}
