package ru.otus.nikolaeva.homework3;

public class Main {
    public static void main(String[] args) {
        sumofPosititiveElements(new int[][] {{1,1,5}, {-10,4,-3}});
        drawSquare(4);
        nullDiagonalsOfArray(new int[][] {{1,1,5}, {10,4,-3}, {10,4,3}});
        findMax(new int[][] {{1,1,5}, {-10,4,-3}});
        sumofSecondRowsofArray(new int[][] {{1,1,5}, {-10,4,-3}, {-10,4,-3}});

    }

    public static int sumofPosititiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void drawSquare( int size){
        char [][] array = new char [size][size];
        for (int i = 0; i < size ; i ++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = '*';
            }
        }
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print (array[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void nullDiagonalsOfArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || j== arr[i].length - i - 1) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]. length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
        return max;
    }

    public static int sumofSecondRowsofArray(int[][]array) {
        int sum = 0;
        if (array.length !=1) {
            for (int i = 0; i < array[1].length; i++) {
                sum += array[1][i];
            }
        } else
            return -1;
        return sum;
    }


}

