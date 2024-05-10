import java.util.*;

public class largestinarray {

    public static int largest(int nums[]){

        int large=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(large<nums[i]){
                large=nums[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enetr size of array");
        int n=scan.nextInt();
        System.out.println("enetr elements of array");
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        nums[i]=scan.nextInt();

        System.out.println("largest element is: "+largest(nums));


    }
}
