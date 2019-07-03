package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateGradesTest{
    CalculateGrades ob = new CalculateGrades();;

    //Test to check average of marks
    @Test
    public void givenGradesShouldReturnAverage()
    {
        double result=ob.checkAverage(new int[]{85, 65, 98, 77});
        assertEquals(81.25,result,0.0);

    }

    //Test to check minimum of marks
    @Test
    public void givenGradesShouldReturnMin()
    {
        int result=ob.checkMin(new int[]{85, 65, 98, 77});
        assertEquals(65,result);

    }

    //Test to check maximum of marks
    @Test
    public void givenGradesShouldReturnMax()
    {
        int result=ob.checkMax(new int[]{85, 65, 98, 77});
        assertEquals(98,result);

    }
}
