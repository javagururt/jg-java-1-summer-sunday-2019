package com.javaguru.lessons.lesson4;

public class HumanAgeClassifierTest {

    public static void main(String[] args) {
        HumanAgeClassifierTest testRunner = new HumanAgeClassifierTest();
        testRunner.shouldClassifyBaby();
        testRunner.shouldClassifyIncorrectData();
        testRunner.shouldClassifyBaby0Years();
    }

    void shouldClassifyBaby() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = 3;
        String expectedResult = "Baby";

        String actualResult = victim.classify(age);

        printCheckResult(expectedResult, actualResult, "shouldClassifyBaby");
    }

    void shouldClassifyBaby0Years() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = 0;
        String expectedResult = "Baby";

        String actualResult = victim.classify(age);

        printCheckResult(expectedResult, actualResult, "shouldClassifyBaby0Years");
    }

    void shouldClassifyIncorrectData() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = -100;

        String expectedResult = "Incorrect data";

        String actualResult = victim.classify(age);

        printCheckResult(expectedResult, actualResult, "shouldClassifyIncorrectData");
    }

    void printCheckResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " FAILED.");
            System.out.println("Expected: " + expectedResult + ", actual: " + actualResult);
        }
    }
}
