package com.javaguru.lessons.lesson6;

class WhileLoopExample {

    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            System.out.print("i = " + i + "; ");
            i++;
        }
        System.out.println();
        System.out.println("Result = " + i);
    }
}
