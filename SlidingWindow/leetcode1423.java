/*
There are several cards arranged in a row, and each card has an associated number of points.
 The points are given in the integer array cardPoints.
In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
Your score is the sum of the points of the cards you have taken.

Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

Example 1:

Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However,
 choosing the rightmost card first will maximize your total score.
  The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12. 
  
*/

class leetcode1423{
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,1};
        int k=3;
        System.out.println(maxPoints(arr, k));
        
    }
    static int maxPoints(int arr[], int k){

        int leftSum=0;
        int rightSum=0;
        int max=0;
        int n=arr.length;

        for(int i=0;i<k;i++)leftSum+=arr[i];

        max=leftSum;

        for(int i=k-1;i>=0;i--){
            leftSum-=arr[i];
            rightSum+=arr[n-i-1];

            max=Math.max(max,leftSum+rightSum);

        }
        return max;
    }
}