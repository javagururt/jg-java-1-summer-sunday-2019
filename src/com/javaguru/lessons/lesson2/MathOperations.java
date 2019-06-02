package com.javaguru.lessons.lesson2;

class MathOperations {

    public static void main(String[] args) {
        int firstNumber = 43213;
        int secondNumber = 8;
        int sumResult = firstNumber + secondNumber;

        System.out.println("Sum result = " + sumResult);

        int subtractResult = secondNumber - firstNumber;

        System.out.println("Subtract result: " + subtractResult);

        int multiplyResult = firstNumber * secondNumber;
        System.out.println("Multiply result = " + multiplyResult);

        double divideResult = firstNumber / (double) secondNumber;

        System.out.println("Divide result = " + divideResult);
    }
}
