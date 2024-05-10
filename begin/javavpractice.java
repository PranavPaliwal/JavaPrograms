public class javavpractice {

    public static void main(String[] args) {
        int i = 70;
        String a="";
        if (i <= 26) {
            char ans = (char) (i + 64);
            System.out.println(ans);
        }
        else{
            while(i%26<0){
                i/=26;
                a+=(char)(i);
               

            }
        }
        System.out.println(a);
    }

}
