package com.javaguru.lessons.lesson7;

class SimpleArrayDemo {

    public static void main(String[] args) {
        String[] words = new String[5];

        words[0] = "Hello";
        words[1] = "How";
        words[2] = "Fine";
        words[3] = "And";
        words[4] = "Fantastic";

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
