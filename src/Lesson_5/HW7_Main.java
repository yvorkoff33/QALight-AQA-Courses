package Lesson_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW7_Main {
    public static void main(String[] args) {
        WorkWithList workWithList = new WorkWithList();
        List<List<String>> ourList = new ArrayList<>();
        workWithList.addNewList(ourList);
        ourList = workWithList.addValueToListList(0, "test01", ourList);
        workWithList.addNewList(ourList);
        ourList = workWithList.addValueToListList(1, "test11", ourList);
        ourList = workWithList.addValueToListList(1, "test12", ourList);
        ourList = workWithList.addValueToListList(0, "test02", ourList);
        workWithList.addNewList(ourList);
        workWithList.addValueToListList(2, "test21", ourList);
        workWithList.addValueToListList(1, "test13", ourList);
    }


}
//        ---------
//        []
//        ---------
//        [test01]
//        ---------
//        [test01]
//        []
//        ---------
//        [test01]
//        [test11]
//        ---------
//        [test01]
//        [test11, test12]
//        ---------
//        [test01, test02]
//        [test11, test12]
//        ---------
//        [test01, test02]
//        [test11, test12]
//        []
//        ---------
//        [test01, test02]
//        [test11, test12]
//        [test21]
//        ---------
//        [test01, test02]
//        [test11, test12, test13]
//        [test21]
//        ---------