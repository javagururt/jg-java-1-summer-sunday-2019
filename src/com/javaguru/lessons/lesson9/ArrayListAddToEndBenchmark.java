package com.javaguru.lessons.lesson9;

import java.util.ArrayList;
import java.util.List;

class ArrayListAddToEndBenchmark {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            integers.add(i);
        }

        long stop = System.currentTimeMillis();

        long result = stop - start;

        System.out.println("Elements added: " + integers.size());
        System.out.println("Result: " + result + " ms");

    }
}
