package com.javaguru.lessons.lesson7;

import java.util.Random;

class ArrayService {

    void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }
}
