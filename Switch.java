package abdulmohsin;

import java.util.Scanner;

public class Switch {
    static void main() {
        Scanner in = new Scanner(System.in);
        String fruits = in.next();
 // this is new or enhanced type of switch statement

        switch (fruits) {
            case "mango" -> System.out.println("king of  fruits");
            case "apple" -> System.out.println("red juicy fruit");
            case "banana" -> System.out.println("rich in potassium");
            case "watermelon" -> System.out.println("better for hydration");
            default -> System.out.println(" Please enter fruits name");
        }
    }
}

// this is old style of writing switch statement
//        System.out.println("enter day num");
//             int num= in.nextInt();
//
//             switch (num){
//                 case 1 : {
//                     System.out.println("monday");
//
//                 }
//                 case 2 : {
//                     System.out.println("tuesday");
//
//                 }
//                 case 3 : {
//                     System.out.println("wednesday");
//
//                 }
//                 case 4 :{
//                     System.out.println("thursday");
//                 }
//                 case 5 : {
//                     System.out.println("friday");
//                     System.out.println("weekday");
//                     break;
//                 }
//                 case 6 : {
//                     System.out.println("saturday");
//                 }
//                 case 7 : {
//                     System.out.println("sunday");
//                     System.out.println("weekend");
//                 }
//                 default:{
//                     System.out.print("enter a day num");
//                 }
//
//
//
//             }




