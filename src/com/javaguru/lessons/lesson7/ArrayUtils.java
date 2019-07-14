package com.javaguru.lessons.lesson7;

class ArrayUtils {

    static int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element; //sum = sum + element;
        }
        return sum;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "] = " + array[i] + " ");
        }
    }
}
