import java.util.*;

public class countOccurrences {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter size of array :");
        int n=scan.nextInt();

        System.out.println("Enter array Elements - ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        System.out.println("Enter the Key to count Occurrences");
        int k=scan.nextInt();

        List<Integer> list=new ArrayList<>();

        occr(list, arr, k,0);
        System.out.println("Key is present on th following indices -");
        for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
        }



        scan.close();
    }

    static void occr(List<Integer>list, int arr[],int k,int i){

        if(i==arr.length) return;

        if(arr[i]==k){
            list.add(i);
        }

        occr(list,arr,k,++i);
    } 
    
}
