package com.javaguru.lessons.lesson9;

import java.util.LinkedList;
import java.util.List;

class LinkedListAddToEndBenchmark {

    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();

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
