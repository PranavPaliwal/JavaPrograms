import java.util.*;
public class matrixmul {

    public static void mul(int a[][],int b[][],int row1,int col1,int row2,int col2){

        int c[][]=new int[row1][col2];

        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                c[i][j]=0;

                for(int k=0;k<col1;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        printmatix(c);
    }
    public static void print(int c[][]){
        
    }
    
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("no of row is matrix 1");
        int row1=scan.nextInt();

        System.out.println("no col in matrix 1");
        int col1=scan.nextInt();

        System.out.println("no of rows in matrix 2");
        int row2=scan.nextInt();

        System.out.println("no of col in matrix 2");
        int col2=scan.nextInt();

        int a[][]=new int[row1][col1];
        int b[][]=new int[row2][col2];

        System.out.println("enter values of matrix 1");
        for (int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                a[i][j]=scan.nextint();

            }
        }

        System.out.println("enetr values of matrix 2");
         for (int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                b[i][j]=scan.nextint();

            }
        }
        

        
    }
    
}
