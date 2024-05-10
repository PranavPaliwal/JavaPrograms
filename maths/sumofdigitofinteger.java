import java.util.*;
public class sumofdigitofinteger {

    public static int sum(int n){

        int sum=0 ;  
        while(n!=0){

            int rem=n%10;
            sum =sum+rem;
            n=n/10;

        }
        System.out.println(sum);
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        sum(n);
    }
    
}
