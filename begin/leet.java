import java.util.*;
public class leet {
    
    public static void main(String[] args) {
        int arr[]={1111,121,2222,22};
        int ans=findNumbers(arr);
        System.out.println(ans);

    }
    
        public static int findNumbers(int[] nums) {
    
            int n=nums.length;
            int count=0;
            int ans=0;
            for(int i=0;i<n;i++){
    
                while(nums[i]!=0){
                    n=n/10;
                    count++;
                }
                if(count%2==0)
                ans++;
            }
           return ans; 
        }
}

