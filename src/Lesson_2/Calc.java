package Lesson_2;

public class Calc {
    /**
     * @param var1 ex 56
     * @param var2 ex "35" -> 35
     * @return
     */
    public Integer sum(int var1, String var2) {
        try {
            // String should be parsed to int via '.parseInt'
            int result = var1 + Integer.parseInt(var2);
            System.out.println("Int + String = " + result);
            return result;
        } catch (NumberFormatException e) {
            System.out.println("Error NumberFormatException: " + e);
            return 888;
        } catch (Exception e) {
            System.out.println("Error Exception: " + e);
            return 999;
        }
    }

    public double sum(Double var1, String var2) throws NumberFormatException {
        Double result = var1 + Double.parseDouble(var2);
        //System.out.println(result);
        return result;
    }


    // ----- HW4 Yevhen Vorkov -----

    public int division(int var1, int var2) {
        try {
            int result = var1 / var2;
            System.out.println("Int division = " + result);
            return result;
        } catch (Exception e) {
            System.out.println("Int division exception = " + e);
            return 777;
        }
    }


    public double division(double var1, double var2) {

        if (var1 != 0 && var2 != 0) {
            double result = var1 / var2;
            System.out.println("Double division = " + result);
            return result;
        } else {
            int l = 777;
            System.out.println("Double division exception = " + l);
            return l;
        }

    }


}

