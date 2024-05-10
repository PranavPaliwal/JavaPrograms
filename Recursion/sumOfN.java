import java.util.*;

public class sumOfN {

    public static int sum(int n){

        int sum=n;

        if(n==1){
            return sum;
        }
        return sum+sum(n-1);
    }

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter n: ");
        int n=scan.nextInt();

        System.out.println("Sum : "+(sum(n)));
    }
    
}
