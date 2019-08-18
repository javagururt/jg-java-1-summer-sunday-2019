package com.javaguru.lessons.lesson10.generic;

class PairTest {

    public static void main(String[] args) {
        Pair<String, Integer> pair = getPair();

        System.out.println(pair.getLeft());
        System.out.println(pair.getRight());
    }

    private static Pair<String, Integer> getPair() {
        Pair<String, Integer> pair = new Pair<>();
        pair.setLeft("LEFT SIDE");
        pair.setRight(100);
        return pair;
    }
}
