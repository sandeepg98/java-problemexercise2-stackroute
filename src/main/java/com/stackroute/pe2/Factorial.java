package com.stackroute.pe2;


public class Factorial {

    public static void main(String[] args){
        System.out.println(factorial(12));
        System.out.println(factorial(13));

        System.out.println(longFactorial(20));
        System.out.println(longFactorial(21));
    }

    public static int factorial(int input){
        if(input < 13){
            if(input == 0)
                return 1;
            else
                return (input * factorial(input-1));
        }
        else{
            System.out.println("Out of range");
            return 0;
        }
    }

    public static long longFactorial(int input){
        if(input < 21){
            if(input == 0)
                return 1;
            else
                return (input * longFactorial(input-1));
        }
        else{
            System.out.println("Out of range");
            return 0;
        }
    }
}
