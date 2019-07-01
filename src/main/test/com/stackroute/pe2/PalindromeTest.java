package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome object = new Palindrome();

    @Test
    public void checkPalindromeTrueLess() {
        boolean output = object.palindrome("12321");
        assertTrue(output);
    }

    @Test
    public void checkPalindromeFalse() {
        boolean output = object.palindrome("123");
        assertFalse(output);
    }
}