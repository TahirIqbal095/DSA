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
        int size = arr.length;
        sortArr(arr, size);

        System.out.print("The sorted array will be : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
     }

     // insertion sort recursively
     public static void sortArr(int[] arr, int size) {
        if(size <= 1) return;

        sortArr(arr, size - 1);
        
        int key = arr[size - 1];
        int j = size - 2;
        while(j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
}
