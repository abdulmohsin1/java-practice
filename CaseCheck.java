package abdulmohsin;

import java.util.Scanner;

public class CaseCheck {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         char ch= in.next().trim().charAt(0);
//         here char is being compare through asci value of small to small z
        if(ch>'a' && ch<'z'){
            System.out.println("lower case");
        }
        else {
            System.out.println("upper case");
        }
       System.out.println(ch);
    }
}
