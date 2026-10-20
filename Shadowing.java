package abdulmohsin;

public class Shadowing {
   static int x=100;

    static void main() {
        System.out.println(x);
        int x =50;
        System.out.println(x);
        System.out.println(x);

        num();
        {
            int c;
//            System.out.println(c);
        }

    }
    static void num(){

        System.out.println(x);
    }
}
