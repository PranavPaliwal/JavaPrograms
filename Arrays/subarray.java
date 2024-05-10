public class subarray {

    public static int subarrayy(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            long result = 0, temp = 0;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                temp = 0;
                for (int k = start; k <=end; k++) {
                    System.out.print(arr[k] + " ");

                    temp += arr[j];
                    result = temp;

                }
                System.out.println(" ");
                System.out.println(result);
            }
            
        }
        return 0;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        subarrayy(arr);

    }
}