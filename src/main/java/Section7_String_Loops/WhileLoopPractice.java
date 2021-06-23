package Section7_String_Loops;

public class WhileLoopPractice {

    public static void main(String[] args) {

        int count = 1;

        while (count <=10){
            System.out.println("Nikunj :: " + count);
            count = count + 1;

            if (count == 6)break;
        }

        String string = "category:appreal category:makeup category:furniture";
        printCategory(string);

    }

    static void printCategory(String str){

        int i = 0;
        while(true) {
            int found = str.indexOf("category",i);
            if(found == -1)break;
            int start = found +9; // Start if the actual category
            int end = str.indexOf(" ",start);
            System.out.println(str.substring(start,end));
            i = end+1;
        }

    }
}
