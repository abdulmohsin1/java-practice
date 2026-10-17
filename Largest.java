package abdulmohsin;

import java.util.Scanner;

public class Largest{
    private static int math;

    static void main() {
        Scanner in= new Scanner(System.in);
          int a = in.nextInt();
           int b = in.nextInt();
            int c = in.nextInt();
//             int max=0;
//              if (a>max){
//                  max= a;
//              }
//              if(b >max){
//                  max= b;
//              }
//              if(c>max){
//                  max= c;
//
//              }
//        System.out.println(max);

//         we can write this code in multiple ways
//          int max = 0;
//           if(a>b){
//               max= a;
//           }
//           else{
//               max=b;
//           }
//            if (c>max) {
//                max=c;
//        }
//        System.out.println(max);
//        we can also do it with math.max();
        int max=Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
