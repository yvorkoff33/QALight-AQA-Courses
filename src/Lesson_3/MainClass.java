package Lesson_3;

public class MainClass {
//    Так же объявить массив и инициализировать его {2,4,26,7,28,10,9,20,33}.
//    Далее вывести в Цикле в консоль\лог :
//    Если элемент массива меньше 10 то Значение элемента + фразу "Элемент меньше десяти"
//    Если элемент равен 10 - то Значение элемента + фразу "Элемент равен десяти"
//    Если элемент массива больше 10 то Значение элемента + фразу " Элемент больше десяти"

    public static int[] ourArray = {2, 4, 26, 7, 28, 10, 9, 20, 33};

    //
    public static void main(String[] args) {
        WorkWithArray workWithArray = new WorkWithArray();
        //workWithArray.printArray(ourArray, 10);

        //int[][] arr2 = new int[3][3];
        //WorkWithArray.fillArr2(arr2);


        // ----- HW 5 Yevhen Vorkov ----
        System.out.println("----- Start HW 5 -----");
        int[][] ourArrayArray = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        System.out.println("=====Print Beautifully Matrix=====");
        WorkWithArray.printArrayArray(ourArrayArray);
        System.out.println("=====");
        int[][] matrix = WorkWithArray.createMatrix(5, 5, 8);
        WorkWithArray.fillingOfLeftDiagonal(matrix, 5, true);
        WorkWithArray.fillingOfRightDiagonal(matrix, 6, true);
        WorkWithArray.fillingOfBothDiagonals(matrix, 7);
        System.out.println("----- End HW 5 -----");
    }
}










