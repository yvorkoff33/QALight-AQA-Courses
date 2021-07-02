package Lesson_1;

public class MainClass {
    public static void main(String[] args) {
//        System.out.println("Hello!!! I'm AQA)");

//        int var1 = 5;
//        int var2;
//        int res;
//        var2 = 10;
//        System.out.println(res);
//        Calc.sum(var1, var2);

//        int var3 = 15;
//        System.out.println(res1);
//        Calc.sum(var1, var3);

//        int result = Calc.sum(20, 25);
//        Calc.sum(result, 35);

//        Calc.sum(Calc.sum(20, 25), 35);

        // Создаем объект типа Calc. New выделяет новое место для ссылки calc.
        Calc calc = new Calc();
        calc.sum("Test", "AQA");

        // Сложение числа и стринги
        calc.sumIntString(33, "55");

        // Сложение чисел и умножение их на 2
        System.out.println("Sum * 2 = ");
        calc.doubleSum(2, 3);

        // ------- HW 3 Yevhen Vorkov (MainClass.java) -------
        Calc.mal(2, 2);
        int varMal = 10;
        Calc.mal(varMal, 5);

        Calc.minus(10, 5);
        int varMinus = 2;
        Calc.minus(10, varMinus);


    }
}
