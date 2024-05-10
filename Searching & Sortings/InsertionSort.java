/*Insertion sort is a simple sorting algorithm that works similar to the way you 
sort playing cards in your hands. 
----The array is virtually split into a sorted and an unsorted part.
Values from the unsorted part are picked and placed at the correct position in the sorted part.*/

import java.util.*;
public class InsertionSort {

    public static void sort(int arr[]){

        for (int i=1;i<arr.length;i++){
            int temp=arr[i]; //element picked from the unsorted part of the unsorted array
            int j=i-1; // previous element of temp element
            
            //finding correct position to insert thee elementtt!!!
            while (j>=0 && arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;   
            }
            arr[j+1]=temp;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no elements in array:");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of the array:");

        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        sort(arr);
        System.out.println("Sorted Array:");
        print(arr);


    }
    
}
