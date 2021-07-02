package Lesson_5;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ourListLits = new ArrayList<>();
        System.out.println(ourListLits);
        ourListLits.add(new ArrayList<>());
        System.out.println(ourListLits);

        ourListLits.get(0).add("Test");
        System.out.println(ourListLits);
        ourListLits.get(0).add("Test1");
        System.out.println(ourListLits);

        // Создать новый пункт
        ourListLits.add(new ArrayList<>());
        ourListLits.get(1).add("Test");
        System.out.println(ourListLits);

        ourListLits.add(new ArrayList<>());
        ourListLits.get(2).add("Test2");
        System.out.println(ourListLits);

        // Remove item index 0 in array index 1
        ourListLits.get(1).remove(0);
        System.out.println(ourListLits);

        // Remove all items by index 1
        ourListLits.remove(1);
        System.out.println(ourListLits);

        //Replace item in array index 0, item index 1
        ourListLits.get(0).set(1, "Test4");
        System.out.println(ourListLits);


        ArrayList<String> line = new ArrayList<>();
        line.add("Test5");
        line.add("Test6");
        System.out.println("Line = " + line);

        // Add from one ArrayList to another ArrayList as LINK
        ourListLits.add(line);
        System.out.println(ourListLits);

        line.add("Test7");
        System.out.println("Line = " + line);
        System.out.println("ourList = " + ourListLits);

        // Add from one ArrayList to another ArrayList NOT a LINK
        ourListLits.add(new ArrayList<>());
        ourListLits.get(3).addAll(line);
        System.out.println(ourListLits);

        line.add("Test8");
        System.out.println(line);
        System.out.println(ourListLits);

        System.out.println("For Each ");
        for (ArrayList<String> row : ourListLits) {
            for (String element : row) {
                System.out.print(element + ", ");
            }
            System.out.println();
        }

    }
}
