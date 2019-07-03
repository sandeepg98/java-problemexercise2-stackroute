package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome object = new Palindrome();

    //When the input is palindrome
    @Test
    public void checkPalindromeTrue() {
        boolean output = object.palindrome("12321");
        assertTrue(output);
    }

    //When the input is not palindrome
    @Test
    public void checkPalindromeFalse() {
        boolean output = object.palindrome("123");
        assertFalse(output);
    }

    //When the input is empty
    @Test
    public void checkEmptyString() {
        boolean output = object.palindrome("");
        assertFalse(output);
    }
}