public class basicJavaEX {

    //sum of first n natural number
    public static int naturalno(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
           sum=sum+i;
        }
        return sum;
    }

    //factorial number
    public static int fact(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }

    // check given number ODD and EVEN
    public static void EvenOdd(int n){
        if(n%2==0){
            System.out.print("given number is Even number: "+ n);
        }else {
            System.out.print("given number is Odd number: "+ n);
        }
    }

    // print 1 to 100 even number
    public static void printeven(){
        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.print( i+" ");
            }
        }
    }
    public static void main(String[] args) {
//        System.out.print("sum of natural : "+naturalno(5));
//        System.out.println();
//        System.out.print("factorial "+ fact(5));
//        System.out.println();
    //     EvenOdd(3);
        printeven();
    }
}
