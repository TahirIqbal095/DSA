package sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total number of elements : ");
        int x = scan.nextInt();
        int[] arr = new int[x];
        
        System.out.println("Enter the elements of an array : ");
        for(int i = 0; i < x; i++) {
            arr[i] = scan.nextInt();
        }

        sortArray(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }

    public static void sortArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int mini = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[mini]) 
                mini = j;
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

    }
}
