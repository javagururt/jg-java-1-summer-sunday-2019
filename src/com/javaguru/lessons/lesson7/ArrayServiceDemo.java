package com.javaguru.lessons.lesson7;

import java.util.Arrays;

class ArrayServiceDemo {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();

        int[] ints = new int[10];

        System.out.println("Array (1): " + Arrays.toString(ints));

        arrayService.fillArrayWithRandomNumbers(ints);

        System.out.println("Array (2): " + Arrays.toString(ints));
    }
}
