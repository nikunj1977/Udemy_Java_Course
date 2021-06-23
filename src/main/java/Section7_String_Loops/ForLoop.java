package Section7_String_Loops;

import java.util.Arrays;


public class ForLoop {

    public static void main(String[] args) {

        String name = "nikunj";

        for (int i = name.length()-1; i >= 0 ; i--) {

            char reverse = name.charAt(i);
            System.out.print( reverse);

        }

        for (int i = 0; i <= 100 ; i++) {
            if(i % 2 == 0){
                System.out.print(" " + i);
            }
        }
    }





}
