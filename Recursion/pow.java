import java.util.*;

public class pow {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = scan.nextDouble();
        System.out.println("Enter y: ");
        double y = scan.nextDouble();
        double ans = power(x, y);
        System.out.println("x to the power y = " + ans);
        scan.close();
    }

    static double power(double x, double y) {
        if (y != 0) {
            return x * power(x, y - 1);
        } else
            return 1;
    }

}
