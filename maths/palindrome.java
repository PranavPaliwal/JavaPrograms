import java.util.*;
public class palindrome {

    public static boolean ckeck(int n){
        int given=n;
        int reverse=0; 

        while(n!=0){
        int rem=n%10;
        reverse=(reverse*10)+rem;
        n=n/10;
    }
         if(given==reverse)
         return true;

         else
         return false;
        
    }
    public static void main(String[] args) {
        System.out.println("Enter any no::");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(ckeck(n));
    }
}
