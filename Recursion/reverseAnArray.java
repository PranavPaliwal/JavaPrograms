public class reverseAnArray {

    static void reverse(int l,int r,int[] arr){

        if(l>r){
            return;
        }

            int temp=arr[r];
            arr[r]=arr[l];
            arr[l]=temp;

            reverse(l+1,r-1, arr);
        }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        reverse(0, arr.length - 1, arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        
    }
}
