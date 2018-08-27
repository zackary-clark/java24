package com.java24hours;

import java.util.*;

public class Grade {
    public static void main(String[] arguements) {
        Random generator = new Random();
        int grade = generator.nextInt(100);

        if (grade < 60) {
            System.out.println("F: " grade);
        } else if (grade < 70) {
            System.out.println("D: " + grade);
        } else if (grade < 80) {
            System.out.println("C: " + grade);
        } else if (grade < 90) {
            System.out.println("B: " + grade);
        } else if (grade <= 100) {
            System.out.println("A: " + grade);
        } else {
            System.out.println("What the hell happened?");
        }
    }
}
