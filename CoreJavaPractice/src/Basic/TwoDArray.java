public class TwoDArray {
    //2D array spiral printing
    public static void spiral(int arr[][]){
        int startrow=0;
        int endrow= arr.length-1;
        int startcol= 0;
        int endcol= arr[1].length -1;

        while(startrow <= endrow && startcol <=endcol){

            for(int i=startrow; i<=endcol; i++){
                System.out.print(arr[startrow][i]+" ");
            }
            startrow++;

            for(int j=startrow; j<=endrow; j++){
                System.out.print(arr[j][endcol]+" ");
            }
            endcol--;

            for(int i= endcol; i>=startcol; i--){
                System.out.print(arr[endrow][endcol]+" ");
            }
            endrow--;

            for(int j=endrow; j>=startrow; j--){
                System.out.print(arr[startcol][endrow]+" ");
            }
            startcol++;


        }
    }


    // Diagonal sum
    public static int diagonal(int arr[][]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[1].length; j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                if(i+j==3){
                    sum+=arr[i][j];
                }

            }
        }
        return sum;
    }

    // search sorted matrix
    public static void searchsortedmatrix(int arr[][]){
        int row=0;
        int col=arr.length-1;
        int key=arr[row][col];

    }
    public static void main(String[] args) {
  //     int arr[][]={{1,2,3,4}, {5,6,7,8} , {9,10,11,12}, {13,14,15,16}};
//        spiral(arr);
  //      System.out.print("diagonal sum: "+diagonal(arr));


    }
}
