// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

public class arraypractice {

    
    public static boolean check(int nums[]) {

        int count = 0;
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {                   
                    return true;                   
                }
                else
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n[]={1,1,1,2,2,3,3,3,3,4};
        System.out.println(check(n));
    }

}
