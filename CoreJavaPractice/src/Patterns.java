public class Patterns {
    public static void p1(int a){
        for(int i=1; i<=a; i++){
            for( int j=1; j<=i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();

        }
    }

    public static void p2(int n){
        for(int i=0; i<n; i++){
            for( int j=1; j<=n-i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();

        }
    }

    public static void p3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
    public static void p4(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }System.out.println();
        }
    }

    public static void p5(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || j==1 || i==row || j== col){
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

    }

    public static void p6(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" "+" ");
            }
            // print *
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void p7(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void p8(int n){
        int count =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

    }

    public static void p9(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if( (i+j)%2== 0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();

        }
    }

    public static void star(int n){
        // first half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("#"+" ");
            }
            for (int j=1; j<= 2*(n-i); j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("#"+" ");
            }
            System.out.println();
        }
        // second half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("#"+" ");
            }
            for (int j=1; j<= 2*(n-i); j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("#"+" ");
            }
            System.out.println();
        }

    }
    public static void p10(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("#"+" ");
            }
            System.out.println();
        }
    }

    public static void p11(int row,int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i; j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=row; j++){
                if(i==1 || j==1 || i==row|| j==col){
                    System.out.print("@"+" ");
                }else {
                    System.out.print(" "+" ");
                }          }
            System.out.println();
        }
    }
    public static void p12(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void p13(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" "+" ");
            }
            for (int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       p1(4);
        System.out.println();
        p2(4);
        System.out.println();
        p3(5);
        System.out.println();
        p4(4);
        System.out.println();
        p5(5,5);
        System.out.println();
        p6(4);
        System.out.println();
        p7(4);
        System.out.println();
        p8(4);
        System.out.println();
        p9(4);
        System.out.println();
        p10(4);
        System.out.println();
        star(4);
        System.out.println();
        p11(5,5);
        System.out.println();
        p12(5);
        System.out.println();
        p13(5);


    }
}
