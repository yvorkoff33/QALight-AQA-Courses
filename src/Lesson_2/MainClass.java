package Lesson_2;

public class MainClass {
    public static void main(String[] args) {
        Calc calc = new Calc();
//        calc.sum(56, "35");
//
//        System.out.println(calc.sum(57, "3a5"));
//
//        System.out.println("Double + String = " + calc.sum(1.5, "2.5"));
//        //System.out.println("Invalid String as double = " + calc.sum(1.5, "2..5"));
//
//
//        int[] age = {15, 20, 25, 30};
//        System.out.println("All ages = " + age[0] + " " + age[1]);
//        System.out.println("Array length= " + age.length);
//        System.out.println("First age = " + age[0]);
//        age[3] = 55;
//        System.out.println("Added age= " + age[3]);
//
//
        int[] ageNew = new int[10];
        ageNew[5] = 10;
        ageNew[0] = 50;
        //System.out.println("" + ageNew[5] + ageNew[4]);

        System.out.println("---Lesson 3----");

        int counter = 0;
        for (int i = 0; i < ageNew.length; i = i + 1) {
            ageNew[i] = 10 + i;
            System.out.println(ageNew[i]);
            counter++;
            System.out.println("line = " + counter);
        }



        System.out.println("---The End----");


// ----- HW4 Yevhen Vorkov -----
//        System.out.println("---Start HW4----");
//
//        calc.division(10, 2);
//        System.out.println("Result int division exception = " + calc.division(100, 0));
//
//        calc.division(10.5, 1.5);
//        calc.division(10.5, 0);
//
//        System.out.println("---End HW4----");
    }


}
