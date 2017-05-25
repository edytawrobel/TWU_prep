package com.example;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class DiamondExercises {

    public static void main(String[] args) {

        isoscelesTriangle(3);
    }

    static void isoscelesTriangle(int n) {
        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j < 4 - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i - 1; j++)
                System.out.print("x");


            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.println("");
        }

    }
}


