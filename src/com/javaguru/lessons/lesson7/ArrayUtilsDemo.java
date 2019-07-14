package com.javaguru.lessons.lesson7;

import java.util.Random;

class ArrayUtilsDemo {

    public static void main(String[] args) {
        int[] integerArray = new int[5];

        Random random = new Random();

        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = random.nextInt(5);
        }

        ArrayUtils.printArray(integerArray);

        System.out.println();
        int sumResult = ArrayUtils.sum(integerArray);

        System.out.println("Sum = " + sumResult);
    }
}
