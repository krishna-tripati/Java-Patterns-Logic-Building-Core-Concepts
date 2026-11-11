import java.util.Scanner;

public class StringEX {
    public static void str(String str){
        for(int i=0; i<=str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }


    }
   //check palindrom or not
    public static boolean isPalindrom(String str){
      int n= str.length()-1;
      for(int i=0; i<= n/2; i++){
          if(str.charAt(i)!=str.charAt(n-i)){
              return false;
          }
      }
      return true;
    }

    public static String toupper(String str){
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
         sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
//        String str="krishna";
//        String str1=new String("krishna tripati");
//        System.out.println(str);
//        System.out.println(str1);
//        System.out.println(str1.length());

//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter a string : ");
//         String s=sc.nextLine();
//        // str(s);
//        System.out.println(isPalindrom(s));


//        String str1="krishna";
//        String str2="krishna";
//        String str3=new String("krishna");
//        System.out.print(str1==str3);

          String name= "my name is krishna";
        System.out.print(toupper(name));

    }
}
