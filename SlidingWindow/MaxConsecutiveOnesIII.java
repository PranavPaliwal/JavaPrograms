/*
Given a binary array nums and an integer k, return the
maximum number of consecutive 1's in the array if you can flip at most k 0's.


Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 */


public class MaxConsecutiveOnesIII {      

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(maxConsecutiveone(nums, k));
    }
    static int maxConsecutiveone(int nums[], int k){
        int left = 0, right = 0, max = 0, zeros=0;
        int n=nums.length;

        while (right<n-1){

            if(nums[right]==0)zeros++;

            while(zeros>k){
                if(nums[left]==0){
                    zeros--;
                }
                left++;
        }
        int len=right-left+1;
        max=Math.max(max,len);
        right++;
        }
        return max;
    }
}