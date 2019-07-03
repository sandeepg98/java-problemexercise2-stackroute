package com.stackroute.pe2;

public class Palindrome {

    public static boolean palindrome(String input){

        if (input.length() == 0)
            return false;

        String reversed = "";

        //Store the reversed input in reversed string
        for(int i=(input.length() - 1); i >= 0; i--)
            reversed = reversed + input.charAt(i);

        //Check if input is equal to reversed string
        if(input.equals(reversed))
            return true;
        else return false;
    }
}
