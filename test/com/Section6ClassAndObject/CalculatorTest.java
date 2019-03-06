package com.Section6ClassAndObject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator c = new Calculator();

    @Test
    void getAdditionResult() {
        c.setFirstNumber(10);
        c.setSecondNumber(10);
        assertEquals(20, c.getAdditionResult());
    }

    @Test
    void getSubtractionResultOfSmallTOBig() {
        c.setFirstNumber(10);
        c.setSecondNumber(10);
        assertEquals(0, c.getSubtractionResult());
    }

    @Test
    void getSubtractionResultOfBigToSmall() {
        c.setFirstNumber(10);
        c.setSecondNumber(20);
        assertEquals(-10, c.getSubtractionResult());
    }

    @Test
    void getMultiplicationResult() {
        c.setFirstNumber(10);
        c.setSecondNumber(10);
        assertEquals(100, c.getMultiplicationResult());
    }

    @Test
    void getDivisionResultOfSameNumbers() {
        c.setFirstNumber(10);
        c.setSecondNumber(10);
        assertEquals(1, c.getDivisionResult());
    }

    @Test
    void getDivisionResultOfDiviserZero() {
        c.setFirstNumber(10);
        c.setSecondNumber(0);
        assertEquals(0, c.getDivisionResult());
    }
}