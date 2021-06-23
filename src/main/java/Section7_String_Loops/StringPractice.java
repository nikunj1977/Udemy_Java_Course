package Section7_String_Loops;

public class StringPractice {

    public static void main(String[] args) {

        String name = "NIKUNJ";

        //char[] newstring = name.toCharArray();
        for (int i = name.length()-1; i > 0; i--) {
            char newstring = name.charAt(i);
            System.out.println(newstring);
        }

        String extract = name.substring(2,5);

        System.out.println(extract);
    }

}
