package Recursion;
import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter any number: ");
        long n=scan.nextInt();

        System.out.println(fact (n));
    }
    static long fact(long n){

        if(n==1)
        return n;

        return n*fact(n-1);
    }
}
