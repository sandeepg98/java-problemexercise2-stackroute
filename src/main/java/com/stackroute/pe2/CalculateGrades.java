package com.stackroute.pe2;

import java.util.Scanner;

public class CalculateGrades {

    //main function to get input from user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberStudent;
        System.out.println("Enter number of students :");
        numberStudent = sc.nextInt();
        int grades[] = new int[numberStudent];
        for (int loop = 0; loop < numberStudent; loop++) {
            System.out.println("Enter the grade for student " + loop);
            grades[loop] = sc.nextInt();
        }

        System.out.println(checkAverage(grades));
        System.out.println(checkMin(grades));
        System.out.println(checkMax(grades));
    }

    //Method to check average
    public static double checkAverage(int grades[])
    {
        double sum=0;
        for(int loop=0;loop<grades.length;loop++)
        {
            sum=sum+grades[loop];
        }
        double average=sum/grades.length;

        return average;
    }

    //Method to calculate minimum grades
    public static int checkMin(int grades[])
    {
        int minValue = grades[0];
        for(int loop=1;loop<grades.length;loop++)
        {
            if(grades[loop] < minValue)
            {
                minValue = grades[loop];

            }
        }
        return minValue;
    }

    //Method to calculate Maximum grades
    public static int checkMax(int grades[])
    {
        int maxValue = grades[0];
        for(int loop=1;loop < grades.length;loop++){
            if(grades[loop] > maxValue){
                maxValue = grades[loop];
            }
        }
        return maxValue;
    }
}