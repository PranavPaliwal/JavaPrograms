import java.util.*;
public class PeakElement{

    public static int element(int nums[]){
        
    int n=nums.length;

    if(n==1) return 0;

    if(nums[0]>nums[1]) return 0;

    if(nums[n-1]>nums[n-2]) return n-2;

    int low=1;
    int high=n-2;
    while(low<=high){
        int mid=(low+high)/2;

        if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
        return mid;

        else if(nums[mid]>nums[mid-1])
        low=mid+1;

        else
        high=mid-1;
    }
       return -1;
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,3,2,1};
        int ans=element(arr);
        System.out.println();
        System.out.println("Index of peak element of the mounatin array is :-");
        System.out.println(ans);
    }
}     