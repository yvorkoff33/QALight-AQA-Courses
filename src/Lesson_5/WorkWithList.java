package Lesson_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorkWithList {
    List<List<String>> addNewList(List<List<String>> ourList) {
        ourList.add(new ArrayList<>());
        WorkWithList.printListList(ourList);
        return ourList;
    }

    static void printListList(List<List<String>> ourList) {
        System.out.println("---------");
        if (ourList.size() == 0) {
            System.out.println(ourList);
        } else if (ourList.size() > 0) {
            Iterator<List<String>> i = ourList.iterator();
            while (i.hasNext()) {
                System.out.println(i.next());
            }
        }
    }

    List<List<String>> addValueToListList(int numberOfList, String value, List<List<String>> ourList) {
        if (numberOfList < 0) {
            System.out.println("Position can't be " + numberOfList);
        } else if (numberOfList <= ourList.size()) {
            ourList.get(numberOfList).add(value);
        } else if (numberOfList > ourList.size()) {
            for (int i = ourList.size() - 1; i < numberOfList; i++) {
                ourList.add(new ArrayList<>());
            }
            ourList.get(numberOfList).add(value);
        }
        WorkWithList.printListList(ourList);
        return ourList;
    }
}



