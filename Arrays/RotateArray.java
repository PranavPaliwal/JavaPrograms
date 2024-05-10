public class RotateArray {



    public static int[] rotate(int arr[],int k){
        int start=0;
        int end=k;
        while(start<=end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,8};
        int [] rotated=rotate(arr, 3);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
        
    }
    
}
