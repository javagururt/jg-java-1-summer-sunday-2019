package com.javaguru.lessons.lesson11;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator victim;

    @Before
    public void setUp() throws Exception {
        victim = new Calculator();
    }

    @Test
    public void shouldCalculateSum() {
        int actual = victim.sum(5,10);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test(timeout = 1000)
    public void shouldCalculate() {
        int actual = victim.sum(5,10);
        int expected = 15;

        assertEquals(expected, actual);
    }
}