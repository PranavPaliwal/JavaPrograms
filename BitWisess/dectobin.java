import java.util.*;
public class dectobin {

    public static int coner(int n){
         int pow=0;
         int binnum=0;
         int given=n;
          
        while(n>0){
             int rem=n%2;
              binnum=binnum+(rem*(int)Math.pow(10,pow));
             pow++;
             n/=2;
        }
        System.out.println("binary of "+given+" is = "+binnum);
return 0;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        coner(n);
    }
    
}
