package abdulmohsin;

import java.util.Scanner;

public class FunctionMethod {
    public static void main(String[] args) {
        int ans = add();
        System.out.print("answer is :" + ans);
    }

    static int add() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num 1 :");
        int num1 = in.nextInt();
        System.out.println("Enter num 2 :");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }
}



