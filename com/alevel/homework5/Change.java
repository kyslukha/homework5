package com.alevel.homework5;

public class Change {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int j = 0; j < 5; j++) {
            System.out.println();
            for (int i = 0; i < 5; i++) {
                arr[i][j] = 1 + (int) (Math.random() * 9);
                System.out.print(" " + arr[i][j]);
            }
        }
        int[][] arrChange = chageArr(arr);//change first letter of method
        System.out.println();
        System.out.print("After change");
        for (int j = 0; j < 5; j++) {
            System.out.println();
            for (int i = 0; i < 5; i++) {
                System.out.print(" " + arrChange[i][j]);
            }
        }
    }

    public static int[][] chageArr(int[][] numbers) {
        int[][] arr1 = new int[numbers.length][numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                arr1[j][i] = numbers[i][j];
                arr1[i][j] = numbers[j][i];
            }
        }
        return arr1;
    }
}
