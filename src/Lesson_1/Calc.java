package Lesson_1;

public class Calc {
    public static int sum(int dodanok1, int dodanok2) {
        int tempRes = dodanok1 + dodanok2;
        System.out.println(tempRes);
        // Should return coz int. If it was void, then we shouldn't add return
        return tempRes;
    }

    public String sum(String line1, String line2) {
        String tempRes = line1 + " " + line2;
//        String tempRes = line1 + line2;
        System.out.println("Result = " + tempRes);
        return tempRes;
    }

    public String sumIntString(int var1, String var2) {
        String res = var1 + var2;
        System.out.println(res);
        return res;
    }

    /**
     * Sum two ints
     *
     * @param var1
     * @param var2
     */
    public void doubleSum(int var1, int var2) {
        System.out.println(sum(var1, var2) * 2);
    }


    // ------- HW 3 Yevhen Vorkov (Calc.java) -------
    public static int mal(int num1, int num2) {
        int res = num1 * num2;
        System.out.println("Mal result = " + res * 2);
        return res;
    }

    public static int minus(int num1, int num2) {
        int res = num1 - num2;
        System.out.println("Minus result = " + res * 2);
        return res;
    }


}
