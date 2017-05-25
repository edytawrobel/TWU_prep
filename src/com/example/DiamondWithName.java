package com.example;


public class DiamondWithName {
    public static void main(String[] args) {
        printDiamondWithName(3);
    }

    static void printDiamondWithName(int n) {
        for (int i = 2; i < n; i += 2) {
            for (int j = 0; j < 3 - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
            System.out.println(" Edyta");

        }

        for (int i = 3; i > 0; i -= 2) {
            for (int j = 0; j < 3 - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
            }
    }
}

