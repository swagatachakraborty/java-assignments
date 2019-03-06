package com.palindrome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @DisplayName("Should return true when the given string is palindrome")
    @Test
    void isPalindromeReturnsTrueForPalindromeString() {
        assertEquals(true, Palindrome.isPalindrome("madam"));
    }

    @DisplayName("Should return false when the given string is palindrome")
    @Test
    void isPalindromeReturnsFalseForNonPalindromeString() {
        assertEquals(false, Palindrome.isPalindrome("madamji"));
    }

    @DisplayName("Should return true when the given number is palindrome")
    @Test
    void isPalindromeReturnsTrueForPalindromeNumber() {
        assertEquals(true, Palindrome.isPalindrome(121));
    }

    @DisplayName("Should return false when the given number is palindrome")
    @Test
    void isPalindromeReturnsFalseForNonPalindromeNumber() {
        assertEquals(false, Palindrome.isPalindrome(123));
    }
}