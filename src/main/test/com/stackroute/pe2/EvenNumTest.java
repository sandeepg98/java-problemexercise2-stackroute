package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {

    EvenNum object = new EvenNum();

    @Test
    public void testForEven(){
        boolean output = object.isEven(8);
        assertTrue(output);
    }

    @Test
    public void testForOdd(){
        boolean output = object.isEven(5);
        assertFalse(output);
    }
}