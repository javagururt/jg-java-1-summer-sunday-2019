package com.javaguru.lessons.lesson6;

class NumberService {

    int sumEvenNumbersInRange(int from, int to) {
        int sum = 0;
        while (from <= to) {
            if (from % 2 == 0) {
                sum += from;
            }
            from++;
        }
        return sum;
    }
}
