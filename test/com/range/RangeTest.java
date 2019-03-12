package com.range;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class NumberRangeTest {
        private Range<Integer> intRange;
        private ArrayList<Integer> all;

    @BeforeEach
    void setUp() {
        intRange = new NumberRange(10, 15);
        all = new ArrayList<>();

        all.add(10);
        all.add(11);
        all.add(12);
        all.add(13);
        all.add(14);
        all.add(15);
    }

    @Test
    void ShouldGiveAllIntegerInTheRange() {
        assertEquals(all, intRange.getAll());
    }

    @Test
    void ShouldGiveTrueWhenTheIntegerIsWithInRange() {
        assertTrue(intRange.contains(12));
    }

    @Test
    void ShouldGiveFalseWhenTheIntegerIsWithInRange() {
        assertFalse(intRange.contains(16));
        assertFalse(intRange.contains(9));
    }
}


class AlphabetRangeTest {
    private Range<Character> charRange;
    private List<Character> all;

    @BeforeEach
    void setUp() {
        charRange = new AlphabetRange('E', 'I');
        all = new ArrayList<>();

        all.add('E');
        all.add('F');
        all.add('G');
        all.add('H');
        all.add('I');
    }

    @Test
    void ShouldGiveAllIntegerInTheRange() {
        assertEquals(all, charRange.getAll());
    }

    @Test
    void ShouldGiveTrueWhenTheIntegerIsWithInRange() {
        assertTrue(charRange.contains('G'));
    }

    @Test
    void ShouldGiveFalseWhenTheIntegerIsWithInRange() {
        assertFalse(charRange.contains('J'));
        assertFalse(charRange.contains('D'));
    }
}