package com.java24hours;

public class PlanetWeight {
    public static void main(String [] arguments) {
        System.out.print("Your weight on Earth is ");
        double weight = 220;
        System.out.println(weight);

        System.out.print("Your weight on Mercury is ");
        double mercury = weight * .378;
        System.out.println(mercury);

        System.out.print("Your weight on the Moon is ");
        double moon = weight * .166;
        System.out.println(moon);

        System.out.print("Your weight on Jupiter is ");
        double jupiter = weight * 2.364;
        System.out.println(jupiter);
    }
}
