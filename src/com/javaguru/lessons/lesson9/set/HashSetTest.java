package com.javaguru.lessons.lesson9.set;

import java.util.HashSet;
import java.util.Set;

class HashSetTest {

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        System.out.println(strings.add("B"));
        System.out.println(strings.add("B"));
        System.out.println(strings.add("B"));
        System.out.println(strings.add("A"));
        System.out.println(strings.add("A"));
        System.out.println(strings.add("A"));
        System.out.println(strings.add("C"));
        System.out.println(strings.add("C"));
        System.out.println(strings.add("C"));

        System.out.println(strings);
    }
}
