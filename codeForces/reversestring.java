
import java.util.*;

public class reversestring {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String s=scan.next();
        String t=scan.next();

        StringBuilder sb=new StringBuilder(t);
        sb.reverse();
        String str=sb.toString();

        if(s.equals(str)){
            System.out.println("YES");
        }
        else
        System.out.println("NO");
    }
}
