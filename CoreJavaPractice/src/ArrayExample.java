public class ArrayExample {
    //Linear search
    public static void linearSearch(int arr[], int key){
        int i=0;
        for( i=0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.print("array index: "+i);
                break;
            }
        }
        if(i == arr.length){
            System.out.print("not found");
        }


    }

    // finding smallest number in array
     public static void smallest(int arr[]){
        int min= Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min=arr[i];
            }

        }
         System.out.print("smallest number: "+min);
     }

     //finding largest number in array
    public static void largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }
        System.out.print("largest number: "+max);
    }

    //reverse array
    public static void reverse(int arr[]){
        int i=0;
        int j=arr.length - 1;
        while (i<=j || i==j){
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    // print subarray
    public static void subarray(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+ arr[i]+ ","+ arr[j]+")");
                 sum+= arr[i]+arr[j];
            }
            System.out.println();
        }
        System.out.print("sum of total subarray: "+sum);
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
//        linearSearch(arr, 20);
//        System.out.println();
//        smallest(arr);
//        System.out.println();
//        largest(arr);

   //     reverse(arr);
      // print(arr);

        subarray(arr);



    }
}
