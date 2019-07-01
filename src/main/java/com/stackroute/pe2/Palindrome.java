package com.stackroute.pe2;

public class Palindrome {

    public static boolean palindrome(String input){

        String reversed = "";

        for(int i=(input.length() - 1); i >= 0; i--)
            reversed = reversed + input.charAt(i);

        if(input.equals(reversed))
            return true;
        else return false;
    }
}
