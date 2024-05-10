import java.util.*;

public class Array2d{
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        int a[][]=new int[3][3];
        int n=a.length;
        int m=a[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=scan.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}
