package com.javaguru.lessons.lesson5;

class DuckTest {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setAge(1);
        duck.setWeight(10.5);
        System.out.println(duck);

        Duck secondDuck = new Duck();
        Duck thirdDuck = secondDuck;
        secondDuck.setAge(1);
        secondDuck.setWeight(10.5);

        if (duck.equals(secondDuck)) {
            System.out.println("Ducks are equals");
        } else {
            System.out.println("Ducks are not equals");
        }

        System.out.println(thirdDuck);
        System.out.println(secondDuck);

        thirdDuck.setAge(2);
        System.out.println();

        System.out.println(thirdDuck);
        System.out.println(secondDuck);
    }
}
