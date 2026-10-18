package abdulmohsin;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner in = new Scanner(System.in);
        double ans = 0;
        System.out.print("enter an operator :");
        char op = in.next().trim().charAt(0);
        while ( op != 'x' || op != 'X') {
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ) {
                System.out.println("enter two number :");
                double num1 = in.nextDouble();
                double num2 = in.nextDouble();
                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num2 * num1;
                } else if (op == '/') {
                    if (num2 > 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("wrong input");
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                } else {
                    System.out.println("invalid operator");
                }
                System.out.println("answer is : " + ans);
            }
        }
    }
}

