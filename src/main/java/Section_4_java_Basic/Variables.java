package Section_4_java_Basic;

import java.util.Arrays;

public class Variables {

    public static void main(String[] args) {


        String[] arra1 = new String[]{"Nikunj", "Bambhroliya"};

       copyArrays(arra1);

       caseSelection(3);


    }


    public static void copyArrays(String[] arr) {
        //int [] arr2 = new int[arr.length];

        String[] arr2 = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }


    }

    public static void caseSelection(int monthNumber) {

        int month = monthNumber;
        String monthName;

        switch (month) {

            case 1:
                monthName = "Monday";
                break;
            case 2:
                monthName = "Tuesday";
                break;
            case 3:
                monthName = "Wednesday";
                break;
            case 4:
                monthName = "Thursday";
                break;
            case 5:
                monthName = "Friday";
                break;
            case 6:
                monthName = "saturday";
                break;
            default:
                monthName = "Sunday";

        }

        System.out.println(monthName);
    }

}

