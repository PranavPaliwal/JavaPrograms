import java.util.*;
public class reverseNoprint {
    
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter n: ");
        int n=scan.nextInt();

        print(n);
    }

    static void print(int n){
        
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.print(n+" ");
        print(n-1);
    }
    
}
