import java.util.Scanner;

public class stringcomp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String t = scan.next();

       String str=s.toLowerCase();
       String stv=t.toLowerCase();

       int x=str.compareTo(stv);

       if(x<0){
        System.out.println("-1");
       }
       else if(x>0){
        System.out.println("1");
       }
       else
       System.out.println("0");
    }
}
