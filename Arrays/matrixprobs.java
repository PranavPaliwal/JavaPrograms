public class matrixprobs {
    public static void main(String[] args) {
        int k[][]={[1,2,3],
                   [4,5,6],
                   [7,8,9]};

                   int n=k.length;
                   int m=k[0].length;
                   for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        if(k[i][j]==5)
                        System.out.println(k[i][j]);
                    }
                   }
        
    }

}
