package abdulmohsin;

public class Scope {



    static void main() {
        int a= 10;
        int b=100;
        String name="abdulmohsin";

        {
            System.out.println(a);
            b=200;

        }
        System.out.println(b);
        String add="azamgarh";
        String contact = "9696357101";
        System.out.println(add);
        System.out.println(contact);
        for(int i=0; i<contact.length(); i+=1){
            System.out.println(i);
        }


    }
}
