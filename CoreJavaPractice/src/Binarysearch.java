public class Binarysearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int key=10;
        int start=0;
        int end=arr.length-1;

        while (start <= end){
            int mid= start+end/2;
            if(arr[mid]==key){
                System.out.print("index: "+mid);
                break;
            } else if (arr[mid]<key) {
                start=start+1;
            }else {
                end=end-1;
            }
        }
    }
}
