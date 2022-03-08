package com.datastructures;

import java.util.Arrays;

// word reversal using arrays
public class MarksOfStudents {


    public static void main(String[]args) {

        int studentsMarks[] = {34, 86, 90, 100, 67, 20, 98, 100};

        //sorting the array in ascending order
            Arrays.sort(studentsMarks);
            for (int i = 0; i <= (studentsMarks.length - 1); i++) {
                System.out.println(studentsMarks[i]);
            }

        System.out.println(studentsMarks.length);

        //finding the average of the marks
            double sum = studentsMarks[0];
            double average;
            for (int counter = 1; counter <= (studentsMarks.length - 1); counter++) {
                sum = sum + studentsMarks[counter];
            }
            average = sum/(studentsMarks.length);
            System.out.println("The average of the marks is "+ average);
        }

    }




