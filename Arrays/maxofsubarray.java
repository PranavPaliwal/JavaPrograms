public class maxofsubarray {

    // brute force
    public static int sumsubarray(int n[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < n.length; i++) {
            int start = i;
            for (int j = i; j < n.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum = currsum + n[k];
                    System.out.println(currsum);
                }
                if (maxsum < currsum)
                    maxsum = currsum;
            }
        }
        System.out.println("maximum sum=" + maxsum);
        return 0;
    }

    // kardane's algorithm
    public static void kardenes(int nums[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < nums.length; i++) {
            currsum += nums[i];
            if (currsum < 0)
                currsum = 0;

            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println("maximum sum of a subarray will be:" + maxsum);

    }

    public static void main(String[] args) {
        int n[] = { 1, -2, 3, -1, 6 };
        kardenes(n);

    }

}
