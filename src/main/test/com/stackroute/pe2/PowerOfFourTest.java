package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerOfFourTest {

    PowerOfFour object = new PowerOfFour();

    @Test
    public void isPowerOfFour(){
        boolean output = object.powerOfFour(16);
        assertTrue(output);
    }

    @Test
    public void isNotPowerOfFour(){
        boolean output = object.powerOfFour(20);
        assertFalse(output);
    }

}