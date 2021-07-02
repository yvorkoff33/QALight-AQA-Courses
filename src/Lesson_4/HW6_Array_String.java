package Lesson_4;

import java.util.ArrayList;
import java.util.Collections;

public class HW6_Array_String {
    public static void main(String[] args) {
        // ------ HW 6 Yevhen Vorkov ------

        String hw6_String = new String();
        hw6_String = "   Test_String ";

        System.out.println("1. '" + hw6_String.trim() + "'");
        System.out.println("2. '" + hw6_String.substring(3, 7) + "'");
        if (hw6_String.startsWith(" ", 0)) {
            hw6_String = hw6_String.trim();
            if (hw6_String.startsWith("T") || hw6_String.startsWith("t")) {
                System.out.println("3. First char is 'T' in '" + hw6_String + "'");
            } else {
                System.out.println("3. First char is not 'T' in '" + hw6_String + "'");
            }
        } else {
            System.out.println("3. First char is not clear '" + hw6_String + "'");
        }
        System.out.println("4. '" + hw6_String.replaceFirst("s", "y") + "'");

        ArrayList hwList = new ArrayList();
        hwList.add("22");
        hwList.add("33");
        hwList.add("44");
        hwList.add("55");
        System.out.println("5. Original ArrayList = " + hwList);
//        Collections.reverse(hwList);
//        System.out.println("5*. Reverse ArrayList hwList = " + hwList);

        ArrayList hwListReverse = new ArrayList();
        for (int i = hwList.size() - 1; i >= 0; i--) {
            hwListReverse.add(hwList.get(i));
        }
        System.out.println("6. Copied from other ArrayList reverse way = " + hwListReverse);




    }
}



