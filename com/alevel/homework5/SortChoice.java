package com.alevel.homework5;

public class SortChoice {
    public static void main(String[] args) {
        System.out.println("Arrow");
        int[] myArray = new int[20];
        for (int i = 0; i < 20; i++) {
            myArray[i] = 1 + (int) (Math.random() * 99);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(" " + myArray[i]);
        }
        int[] sortingChoice = sortingChoice(myArray);//change first letter of method
        System.out.println();
        System.out.println("Sorting");
        for (int i = 0; i < 20; i++) {
            System.out.print(" " + sortingChoice[i]);
        }
    }

    public static int[] sortingChoice(int[] numbers) { //method for sorting
        for (int i = 0; i < 19; i++) {
            int min = numbers[i];
            int counter = i;
            for (int j = i + 1; j < 20; j++) {
                if (numbers[j] < min) {
                    counter = j;
                    min = numbers[j];
                }
            }
            int swap = numbers[counter];
            numbers[counter] = numbers[i];
            numbers[i] = swap;
        }
        return numbers;
    }
}
