public class ReverseAnArray {

    public static void reverse(int n[]) {
        int first = 0, last = n.length - 1;
        while (first < last) {

            // swap
            int temp = n[last];
            n[last] = n[first];
            n[first] = temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5, 6, 7, 8, };
        System.out.println("before revrsing array-");

        for (int j = 0; j < n.length; j++)
            System.out.print(n[j] + " ");

        reverse(n);
        
        System.out.println();

        System.out.println("after revrsing array-");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();

    }

}