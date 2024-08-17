import java.util.*;

public class fibonnaci {

    public static int fib(int n){
        if(n==1|| n==2){
            return 1;
        }
        if(n==1){
            return n;
        }
        return fib(n-2)+fib(n-1);

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter no: ");
        int n=scan.nextInt();

        System.out.println(fib(n));

    }
}
