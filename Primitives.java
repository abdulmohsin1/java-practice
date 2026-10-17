package abdulmohsin;

import java.util.Scanner;

public class Primitives {
   public static void main() {
       Scanner input= new Scanner(System.in);
       System.out.print("enter your name : ");
       String name = input.nextLine();
        System.out.println("your name is "+ name);
       System.out.print("enter some number here :");
        int marks= input.nextInt();
        System.out.println(" your marks is " + marks);

    }
}
