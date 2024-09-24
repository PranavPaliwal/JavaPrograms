public class kadensAlgo {

        public static void main(String[] args){
    
            int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
            int start=0;
            int end=0;

            int currsum=0;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                currsum+=arr[i];
                
                if(max<currsum){
                    max=currsum;
                    end=i;
                }
                if(currsum<0){
                    currsum=0;
                    start=i+1;
                }
            }
            System.out.println("Maximum sum:  " +max);
            System.out.println("Start : "+start+" end : "+end);
        }
    
}
