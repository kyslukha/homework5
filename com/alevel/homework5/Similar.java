package com.alevel.homework5;

public class Similar {
    public static void main(String[] args) {
        System.out.println("Arrow");
        int[] myArray = new int[20];
        for (int i = 0; i < 20; i++) {
            myArray[i] = 1 + (int) (Math.random() * 9);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(" " + myArray[i]);
        }
        int[] findSimilar = findSimilar(myArray);//change first letter of method
        int findMaxSimilar = findMaxSimilar(findSimilar);//change first letter of method
        System.out.println();
        System.out.println("Maximum of similar numbers = " + findMaxSimilar);
        System.out.println("Numbers  ");
        for (int i = 0; i < 20; i++) {
            if (findSimilar[i] == findMaxSimilar) {
                System.out.print(" " + myArray[i]);
            }
        }
    }

    public static int[] findSimilar(int[] numbers) { // method for find similar numbers
        int[] similar = new int[20];
        for (int i = 0; i < 20; i++) {
            similar[i] = 1;
        }
        int[] counter = new int[20];
        for (int i = 0; i < 19; i++) {
            for (int j = 19; j > i; j--) {
                if ((counter[j] != 1) && (numbers[i] == numbers[j])) { //find mistake of code
                    similar[i] = similar[i] + 1;
                    counter[j] = 1;
                }
            }
        }
        return similar;
    }

    public static int findMaxSimilar(int[] numbers) { //method for find maximum of similar numbers
        int maximum = numbers[0];
        for (int i = 1; i < 20; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }
        return maximum;
    }
}
