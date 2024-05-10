/* DEFINATION---
Selection sort is a simple and efficient sorting algorithm that works by 
repeatedly selecting the smallest (or largest) element from the unsorted portion of the list
and moving it to the sorted portion of the list. 
*/

import java.util.Scanner;

public class SelectionSort {

    public static void sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");      
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of an Array:");
        int n = scan.nextInt();
        int arr[] = new int[n];

        System.out.println("Enetr elements of an array:");
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        sort(arr);
        System.out.println("Sorted  array");
        print(arr);
    }
}
