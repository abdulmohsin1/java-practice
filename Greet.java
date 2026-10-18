package abdulmohsin;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ente ryour name :");
        String naam=in.next();
        String msg=greet(naam);
        System.out.println(msg);
    }

   static String greet(String name){
        String message= "hello" +" "+ name;
        return message;
    }
}
