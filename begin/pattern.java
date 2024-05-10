
public class pattern {
    public static void main(String[] args) {
        pattern1(n:4);
    }

    static void pattern1(int n){
        for(int i=1;i<= n;i++){
            for(int j=1;j<=i;j++){
                System.out.println(j);
            }
        }System.out.println();
    }
}