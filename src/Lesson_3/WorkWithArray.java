package Lesson_3;

import java.util.Random;

public class WorkWithArray {
    public void printArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < value) {
                System.out.println(array[i] + " Element is less than " + value);
            } else if (array[i] == value) {
                System.out.println(array[i] + " Element equals " + value);
            } else if (array[i] > value) {
                System.out.println(array[i] + " Element is more than " + value);
            } else {
                System.out.println("Can't calculate this element");
            }
        }
    }
    //     RANDOM
    public static int[][] fillArr2(int[][] arr2) {
        Random random = new Random();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = random.nextInt(4);
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        return arr2;
    }


    // ----- HW 5 Yevhen Vorkov ----
    static void printArrayArray(int[][] ArrayArray) {

        for (int a = 0; a < ArrayArray.length; a++) {
            for (int i = 0; i < ArrayArray[a].length; i++) {
                System.out.print(ArrayArray[a][i] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix(int i, int i1, int value) {
        System.out.println("=====Create Matrix=====");
        if (i == 0) {
            System.out.println("Can't be 0 ");
            i = 1;
        }
        if (i1 == 0) {
            System.out.println("Can't be 0");
            i1 = 1;
        }
        if (i < 0){
            System.out.println("Can't be '-'");
            i = i * (-1);
        }
        if (i1 < 0){
            System.out.println("Can't be '-'");
            i1 = i1 * (-1);
        }
        int[][] temp1 = new int[i][i1];
        for (int j = 0; j < temp1.length; j++) {
            for (int k = 0; k < temp1[j].length; k++) {
                temp1[j][k] = value;
            }
        }
        printArrayArray(temp1);
        System.out.println("==========");
        return temp1;
    }


    public static int[][] fillingOfLeftDiagonal(int[][] leftDiagonal, int n, boolean print) {
        if (print){
            System.out.println("=====Left Matrix=====");
        }
        int firstSize = leftDiagonal.length;
        int secondSize = leftDiagonal[0].length;
        if (firstSize == secondSize) {
            for (int i = 0; i < leftDiagonal.length; i++) {
                for (int j = 0; j < leftDiagonal[i].length; j++) {
                    if (i == j) {
                        leftDiagonal[i][j] = n;
                        break;
                    }
                }
            }
        } else {
            System.out.println("The matrix is not square");
        }
        if (print) {
            printArrayArray(leftDiagonal);
            System.out.println("==========");
        }
        return leftDiagonal;
    }

    public static int[][] fillingOfRightDiagonal(int[][] rightDiagonal, int m, boolean print) {
        if (print){
            System.out.println("=====Right Matrix=====");
        }
        int firstSize = rightDiagonal.length;
        int secondSize = rightDiagonal[0].length;
        if (firstSize == secondSize) {
            for (int i = 0; i < rightDiagonal.length; i++) {
                for (int j = 0; j < rightDiagonal[i].length; j++) {
                    if (i == rightDiagonal.length - 1 - j) {
                        rightDiagonal[i][j] = m;
                        break;
                    }
                }
            }
        } else {
            System.out.println("The matrix is not square");
        }
        if (print) {
            printArrayArray(rightDiagonal);
            System.out.println("==========");
        }
        return rightDiagonal;
    }


    public static int[][] fillingOfBothDiagonals(int[][] bothDiagonal, int n) {
        System.out.println("=====Both Diagonals=====");
        fillingOfLeftDiagonal(bothDiagonal, n, false);
        fillingOfRightDiagonal(bothDiagonal, n, false);
        printArrayArray(bothDiagonal);
        System.out.println("==========");
        return bothDiagonal;
    }
}





