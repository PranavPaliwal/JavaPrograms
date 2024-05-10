import java.util.*;
public class bintodec {

    public static int bintodec(int n){

        int decno=n;
        int dec=0;
        int pow=0;
        while(n>0){
            int lastdigit=n%10;
            dec=dec+(lastdigit*(int)Math.pow(2,pow));
           
            pow++;
            n=n/10;

        }
        System.out.println("decimal of "+decno+" is "+dec);
        return 0;
       }
       public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        bintodec(n);
        
    }

}
