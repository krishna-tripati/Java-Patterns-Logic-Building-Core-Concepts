public class Sorting {

    //bubble sort
    public static void bubble(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] >= arr[j+1] ){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }

    //selection sort
    public static void selection(int arr[]){
        for(int i=0; i<arr.length; i++){
            int min=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

     // printing array data
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
      //  bubble(arr);
        selection(arr);
        print(arr);

    }
}
