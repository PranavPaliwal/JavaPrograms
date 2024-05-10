import java.util.*;
public class iseven {

    public static boolean iseven(int n){
        if(n%2==0){
            return true;
        }
        else
        return false;

        
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(iseven(n));
    }
    
}
