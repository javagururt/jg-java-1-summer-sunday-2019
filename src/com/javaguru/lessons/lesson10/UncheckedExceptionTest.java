package com.javaguru.lessons.lesson10;

class UncheckedExceptionTest {

    public static void main(String[] args) {
        shouldThrowRuntimeException();
    }

    public static void shouldThrowRuntimeException() {
        throw new RuntimeException("Unchecked exception");
    }
}
