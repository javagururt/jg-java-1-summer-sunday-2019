package com.javaguru.lessons.lesson6;

class NumberServiceDemo {

    public static void main(String[] args) {
        NumberService service = new NumberService();
        int sumResult = service.sumEvenNumbersInRange(0, 10);
        System.out.println("Sum result = " + sumResult);
    }
}
