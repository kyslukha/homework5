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
        int[] findSimilar = FindSimilar(myArray);
//        System.out.println();
//        System.out.println("Similar");

//        for (int i = 0; i < 10; i++) {
//            System.out.print(" " + findSimilar[i]);
//        }
        int findMaxSimilar = FindMaxSimilar(findSimilar);
        System.out.println();
        System.out.println("Maximum of similar numbers = " + findMaxSimilar);
        for (int i=0; i<20;i++){
            if (findSimilar[i]==findMaxSimilar){
                System.out.println(myArray[i]);
            }
        }


    }

    public static int[] FindSimilar(int[] numbers) {
        int[] similar = new int[20];
        for (int i = 0; i < 20; i++) {
            similar[i] = 1;
        }

        int[] counter = new int[20];
        for (int i = 0; i < 19; i++) {
            for (int j = 19; j > i; j--) {
                if (counter[j] == 1) {
                    break;
                } else {
                    if (numbers[i] == numbers[j]) {
                        similar[i] = similar[i] + 1;
                        counter[j] = 1;
                    }
                }
            }
        }
        return similar;
    }

    public static int FindMaxSimilar(int[] numbers) {
        int maxSimilar = numbers[0];
        for (int i = 1; i < 20; i++) {
            if (numbers[i] > maxSimilar) {
                maxSimilar = numbers[i];
            }

        }
        return maxSimilar;
    }
}
