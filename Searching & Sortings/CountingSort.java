/*
Counting Sort is a non-comparison-based sorting algorithm that works well when 
there is limited range of input values. It is particularly efficient when the range of input values is small
compared to the number of elements to be sorted. 
The basic idea behind Counting Sort is to count the frequency of each distinct element
in the input array and use that information to place the elements in their correct sorted positions.
*/


public class CountingSort {
    public static void sort(int arr[]){

        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
         largest=Math.max(largest, arr[i]);           
        }
         int count[]=new int[largest+1];
        for(int i=0;i<count.length;i++){

            count[arr[i]]++;                  //creating a array of size of the largest element in the given array.
        }  

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){

            while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[] args) {
        int arr[]={9,7,6,1,3,5,4,7,8,6,9};
        sort(arr);
        print(arr);
    }
}
