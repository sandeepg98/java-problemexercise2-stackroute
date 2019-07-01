package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReadAndPrintTest {

    ReadAndPrint object = new ReadAndPrint();

    /*@Test
    public void givenCorrectFileShouldReturnResult() throws Exception {
        String result = object.readPrint("./test.txt");
        assertEquals("HEY! THIS IS A TEXT FILE.\n" +
                              "THIS IS A NEW LINE.", result);
    }*/

    @Test
    public void givenCorrectFileShouldReturnResult() throws Exception {
        long result = object.readPrint("./test.txt");
        assertEquals(45,result);
    }
}