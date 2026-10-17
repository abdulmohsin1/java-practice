package abdulmohsin;

import java.util.Scanner;

public class CelsiusTOf {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter temp in c :");
        float tempc= in.nextFloat();
         float tempf= (tempc*9/5)+32;
        System.out.println("farenhit :"+tempf);
    }
}
