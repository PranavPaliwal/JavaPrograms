import java.util.*;

 public class binarysearch {

//     public static int binarysearch(int arr[],int key){
//         int start=0, end=arr.length-1;

//         while(start <=end){
//             int mid=(start+end)/2;

//             if(arr[mid]==key)
//             return mid;

//             else if(arr[mid]<key)
//             start= mid+1;

//             else
//             end=mid-1;

//         }
//         return -1;
//     }

public static int recursivebinary(int arr[],int key, int l, int r){

if(r>=l){
    int  mid=(l+r)/2;

    if(arr[mid]==key)
    return mid;

    else if(arr[mid]>key)
    return recursivebinary(arr, mid+1, r,key);

    else
    return recursivebinary(arr, l , mid-1 ,key);
}
else
return -1;
    


}
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter no of elements in the array: ");
        int n=scan.nextInt();
        
        System.out.println("enter elements of the array:- ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();

        System.out.println("enter element to be searched: ");
        int key=scan.nextInt();
        
        int l=0,r=n-1;

        int result=recursivebinary( arr,key ,l,r);

        if(result==-1)
        System.out.println("element is not present in the array");
        else
        System.out.println("element is at index"+result);
        
        scan.close();

    }
}

