package abdulmohsin;

import java.util.Arrays;

public class VarLenArgs {
    static void main() {
varlen(54,45,4,64,654,5,4,4,654,564,564); // here we are passsing args in varlengthArgeumnet we can as much as we want

          multiType(10,20,"a","b","c","d","d","e");
    }



    static void varlen(int...v){  //here int ...v is taking indefinit arguement we use this when we dont know how much args w needed we
        // we can use it any datatype

        System.out.println(Arrays.toString(v));
    }


    static void multiType(int a, int b, String...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
