// Array esay 832
// reverse and then invert

class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i=0;i<A.length;i++){
            int[] temp = new int[A[i].length];


            for (int k=A[i].length-1;k>=0;k--){
                temp[A[i].length-1-k]=A[i][k];
            }


            for (int j=0;j<A[i].length;j++){
                if(temp[j]==1){
                    A[i][j]=0;
                }else{
                    A[i][j]=1;
                }



            }

        }

        return A;

    }
}