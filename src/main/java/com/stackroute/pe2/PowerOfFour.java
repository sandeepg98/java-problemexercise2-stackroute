package com.stackroute.pe2;

public class PowerOfFour {

    public static boolean powerOfFour(int input){
        if(input==0) return false;

        return (int)(Math.ceil((Math.log(input) / Math.log(4)))) == (int)(Math.floor(((Math.log(input) / Math.log(4)))));
    }
}
