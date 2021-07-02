package Lesson_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClassList {
    public static void main_L(String[] args) {
//        List ourList = new ArrayList();
        ArrayList<String> ourList = new ArrayList<String>(); // Only String
        ourList.add("Test");
        ourList.add("Array");
        ourList.add("List");
        System.out.println("List = " + ourList);
        System.out.println("Get index 2 from List = " + ourList.get(2));
        System.out.println("List size = " + ourList.size());

        System.out.println("--- List like in Word ---");
        for (int i = 0; i < ourList.size(); i++) {
            System.out.println((i + 1) + ". " + ourList.get(i));
        }

        System.out.println("--- Or like this with for each ---");
        int counter = 1;
        for (String element : ourList) {
            System.out.println(counter + ". " + element);
            counter++;
        }

        System.out.println(ourList);
        ourList.remove(2);
        System.out.println(ourList);

        // Add by index
        ourList.add(0, "First");
        System.out.println(ourList);

        for (int i = 0; i < ourList.size(); i++) {
            if (ourList.get(i).contains("Array")) {
                System.out.println("Index = " + i);
                break;
            }

        }
    }
}


