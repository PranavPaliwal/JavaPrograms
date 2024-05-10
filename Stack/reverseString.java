import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a String: ");

        String str=scan.nextLine();

        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            s.push(c);
        }
        StringBuilder sb=new StringBuilder();

        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        System.out.println(sb.toString());
    }
}
