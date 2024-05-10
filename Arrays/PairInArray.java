public class PairInArray {

    public static int pairs(int arr1[]) {

        for (int i = 0; i < arr1.length; i++) {
            int current = arr1[i];
            for (int j = i + 1; j < arr1.length; j++) {
                System.out.print("(" + current + "," + arr1[j] + ")");

            }
            System.out.println();

        }

        return 0;
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(pairs(n));

    }
}
