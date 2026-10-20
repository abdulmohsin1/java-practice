package abdulmohsin;

import java.util.Scanner;

public class CountNum {
    static void main() {
      ///  finding frequency of number
//         Scanner in = new Scanner(System.in);
//         int n  = in.nextInt();

          int n=26568545;
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==5){
                count++;
            }
            n=n/10;

        }
        System.out.println(count);

    }
}