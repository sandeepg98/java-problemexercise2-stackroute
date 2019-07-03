package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerOfFourTest {

    PowerOfFour object = new PowerOfFour();

    //When given integer is power of 4
    @Test
    public void isPowerOfFour(){
        boolean output = object.powerOfFour(16);
        assertTrue(output);
    }

    //When given integer is not power of 4
    @Test
    public void isNotPowerOfFour(){
        boolean output = object.powerOfFour(20);
        assertFalse(output);
    }

}