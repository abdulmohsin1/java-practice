package abdulmohsin;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class TypeCasting {
    static void main() {
        Scanner input= new Scanner(System.in);
//         float num= input.nextInt(); here i m giving integer in float and it will automatically converting it into float value this is known as implicit casting
//        System.out.println(num);
//        here we cannot convert float into integer as it is bigger than int but we can explicitly
//        int num = input.nextFloat();
//        System.out.println(num); it will not work as it is incompatible

//         explicit type casting or narrowing

//         int num =354534.0545f; it will generate error
//        System.out.println(num);
//         eg: type casting in compatible data
//         int num= (int) (12564.12f);
//        System.out.println(num);
//         automatic type promotion in expression
//        int number= 'a';
//        System.out.println(number);

        byte b=45;
        char c= 'a';
        short s= 454;
        int i= 50000;
        float f= 4545.0f;
        double d=0.5467;
        double result = (f*b)+ (i/c)+(d*s);

        System.out.println(result);
//        here is actually  automatic type promotion of expression is happening it will convert from short to bigger
//                like byte, char, short will be conveted to integer if integer is present in express and
//                integer will be convert into long is long is in express and long will be converted to float if float sis present in expression
//                float will be converted to double if double is present in the expression
}
}