// Program to determine longest Common Suffix!!

import java.util.*;

class lcs{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String str[]={"Home", "House", "How", "Howl"};
        int n=str.length;
        
        System.err.println(longestSuffix(str, n));

        scan.close();

    }

    public static String longestSuffix(String[] str,int n){

        String ans="";

        for(int i=0;i<str[0].length();i++){

            //Picks the first String of String Array
            char c=str[0].charAt(i);
            boolean match=true;

            // Travers all the rest of Strings of String Array
            for(int j=1;j<n;j++){

                // if string at 'j' is not less than first String of the Charcter Dose'nt matches
                if(i>=str[j].length() || c!=str[j].charAt(i)){
                    match= false;
                    break;
                }
            }

            if(match==false)
            break;

            else
            ans+=c;

        }
        return ans;
    }
}