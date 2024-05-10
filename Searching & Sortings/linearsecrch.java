import java.util.*;
public class linearsecrch{

    public static int linearsearch(int arr[],int key){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no elements in the array");
        int n=sc.nextInt();
     
        System.out.println("enetr array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enetr the key element to be searched");
        int key=sc.nextInt();
        int index=linearsearch(arr,key);
        if(index==-1)
        System.out.println("element not found in the array");

        else
        System.out.println("element found at index "+index);
    }
}