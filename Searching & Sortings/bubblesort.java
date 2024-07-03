/*  DEFINATION---
 Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping
  the adjacent elements if they are in the wrong order. 
  This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.

-----Traverse from left and compare adjacent elements and the higher one is placed at right side. 
-----In this way, the largest element is moved to the rightmost end at first. 
-----This process is then continued to find the second largest and place it and so on until the data is sorted
 */

import java.util.Scanner;

public class bubblesort {


    public static void bubblesortt(int arr[]){
        for(int i=0;i<arr.length-1;i++){  //outer loop takes care about the no of passes.
            for(int j=0;j<arr.length-1-i;j++){ //inner loop is used to check and swap adjcent elements
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

                }
                
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

        System.out.println("");
    }
    public static void main(String[] args) {
       int arr[]={ 5 , 4, 1, 3 , 2,9, 8 , 7 };
       System.out.println("Before sorting : ");
        print(arr);
        bubblesortt(arr);
        System.out.println("After sorting : ");
        print(arr);
        
        
    }
    
}
