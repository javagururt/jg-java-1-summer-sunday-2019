package com.javaguru.lessons.lesson6;

class SumOfEvenNumbersDemo {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                sum = sum + i; // sum += i;
                System.out.println("i = " + i + "; sum = " + sum);
            }
        }
        System.out.println("Result = " + sum);
    }
}
