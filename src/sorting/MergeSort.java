package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int x = scan.nextInt();
        int[] arr = new int[x];
        
        System.out.print("Enter the elements of an array : ");
        for(int i = 0; i < x; i++) {
            arr[i] = scan.nextInt();
        }

        mergeSort(arr, 0, x - 1);

        for(int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if(low >= high) return;

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low; // starting point of the left half of array
        int right = mid + 1; // starting point of the right part of the array

        ArrayList<Integer> temp = new ArrayList<>();

        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while(right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for(int i = low; i <= high; i++) {
            arr[i] = temp.get(i-low);
        }

    }
}
