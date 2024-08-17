
import java.util.*;

public class printall {
    public static void main(String[] args) {
        int arr[]={3,1,2};
        List<Integer> list=new ArrayList<>();
        int n=3;
        printSubsequences(0,arr,list,3);
    }

    static void printSubsequences(int idx,int arr[], List<Integer> list,int n){
        if(idx==n){
            for(int i:list){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        list.add(arr[idx]);
        printSubsequences(idx+1, arr, list, n);
        list.remove(list.size()-1);

        printSubsequences(idx+1, arr, list, n);
      }
}
