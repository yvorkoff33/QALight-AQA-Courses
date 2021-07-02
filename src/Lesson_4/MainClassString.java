package Lesson_4;

import java.util.Locale;

public class MainClassString {
    public static void main(String[] args) {
        String line = new String("Test line");
        String line2 = " Test line 2  ";

//        System.out.println("Upper = " + line.toUpperCase());
//        System.out.println("Lower = " + line.toLowerCase(Locale.ROOT));
//        System.out.println("Length = " + line.length());
//        System.out.println("Show part letters = " + line.substring(2));
//        System.out.println("Show part letters begin and end = " + line.substring(2,9));


//         System.out.println("Don't show space before and after '" + line2.trim() + "'");

//        line2 = "test line";
//        if (line.equalsIgnoreCase(line2)) {
//            System.out.println("Lines are equals");
//        } else {
//            System.out.println("Lines are not equals");
//        }

        String line3 = "test;test1;Test3";
        // Split by symbol ';'
//        System.out.println(line3.split(";")[2]);

        // Find and replace
//        System.out.println(line3.replace(";","'"));

//        if (line3.toUpperCase().startsWith("T")){
//            System.out.println("Start with 'T'");
//        } else {
//            System.out.println("Don't start with 'T");
//        }

        String longLine = "Line1\n" + "Line2";
        System.out.println(longLine);

        System.out.println(line3.replace("t", "ss").replace("T", "ss").replace("ss", "Y"));
    }

}
